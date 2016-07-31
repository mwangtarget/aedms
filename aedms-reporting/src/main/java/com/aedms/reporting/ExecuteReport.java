package com.aedms.reporting;


import java.util.HashMap;
import java.util.logging.Level;
 
import org.eclipse.birt.core.framework.Platform;
import org.eclipse.birt.report.engine.api.EngineConfig;
import org.eclipse.birt.report.engine.api.EngineConstants;
import org.eclipse.birt.report.engine.api.EngineException;
import org.eclipse.birt.report.engine.api.HTMLActionHandler;
import org.eclipse.birt.report.engine.api.HTMLEmitterConfig;
import org.eclipse.birt.report.engine.api.HTMLRenderContext;
import org.eclipse.birt.report.engine.api.HTMLRenderOption;
import org.eclipse.birt.report.engine.api.HTMLServerImageHandler;
import org.eclipse.birt.report.engine.api.IReportEngine;
import org.eclipse.birt.report.engine.api.IReportEngineFactory;
import org.eclipse.birt.report.engine.api.IReportRunnable;
import org.eclipse.birt.report.engine.api.IRunAndRenderTask;
import org.eclipse.birt.report.engine.api.PDFRenderOption;

/**
 * Sample program for understanding eclipse birt
 * @author Lenovo
 *
 */
public class ExecuteReport {
    static void executeReport() throws EngineException {
        final HashMap<String, Integer> PARAMETERS = new HashMap<String, Integer>();
 
        final String NAME = "Top Count";
        final Integer VALUE = new Integer(4);
 
        PARAMETERS.put(NAME, VALUE);
 
        IReportEngine engine = null;
        EngineConfig config = null;
 
        try {
 
           // Configure the Engine and start the Platform
           config = new EngineConfig();
           config.setEngineHome("D:/Installation/BIRT/birt-runtime-4.5.0-20150609/birt-runtime-4_5_0");
           // set log config using (null, Level) if you do not want a log file
           config.setLogConfig("D:/Installation/BIRT/birt-runtime-4.5.0-20150609/birt-runtime-4_5_0/logs", Level.FINE);
 
           Platform.startup(config);
           final IReportEngineFactory FACTORY = (IReportEngineFactory) Platform.
                 createFactoryObject(IReportEngineFactory.EXTENSION_REPORT_ENGINE_FACTORY);
 
           engine = FACTORY.createReportEngine(config);
           engine.changeLogLevel(Level.WARNING);
 
        } catch(Exception ex) {
           ex.printStackTrace();
        }
 
        // Configure the emitter to handle actions and images
        final HTMLEmitterConfig EMITTER_CONFIGURATION = new HTMLEmitterConfig();
 
        EMITTER_CONFIGURATION.setActionHandler(new HTMLActionHandler());
        HTMLServerImageHandler imageHandler = new HTMLServerImageHandler();
        EMITTER_CONFIGURATION.setImageHandler(imageHandler);
        config.getEmitterConfigs().put("html", EMITTER_CONFIGURATION); // $NON-NLS-1$
 
        // Open the report design
        final IReportRunnable DESIGN =
              engine.openReportDesign("E://aedms//development//aedms//aedms-reporting//src//main//resources//customers.rptdesign"); 
 
        // Create task to run and render the report:
        final IRunAndRenderTask TASK = engine.createRunAndRenderTask(DESIGN); 
 
        // Set Render context to handle URL and image locations
        final HTMLRenderContext RENDER_CONTEXT = new HTMLRenderContext();
        // Set the Base URL for all actions
        RENDER_CONTEXT.setBaseURL("http:// localhost/");
        // Tell the Engine to prepend all images with this URL - Note this requires using 
        // the HTMLServerImageHandler
        RENDER_CONTEXT.setBaseImageURL("http:// localhost/myimages");
        // Tell the Engine where to write the images to
        RENDER_CONTEXT.setImageDirectory("C:/xampplite/htdocs/myimages");
        // Tell the Engine what image formats are supported.  Note you must have SVG in the string 
        // to render charts in SVG.
        RENDER_CONTEXT.setSupportedImageFormats("JPG;PNG;BMP;SVG");
        final HashMap<String, HTMLRenderContext> CONTEXT =
              new HashMap<String, HTMLRenderContext>();
        CONTEXT.put(EngineConstants.APPCONTEXT_HTML_RENDER_CONTEXT, RENDER_CONTEXT);
        TASK.setAppContext(CONTEXT);
        // Set PARAMETERS for the report
        TASK.setParameterValues(PARAMETERS);
        // Alternatively set each separately
        // TASK.setParameterValue("Top Count", new Integer(12));
        TASK.validateParameters();
 
        // Add a scriptable object, which will allow the report developer to put
        // script in the report that references this Java object, e.g. in script 
        // pFilter.myjavamethod()
        // final ProcessFilter PF = new ProcessFilter();
        // TASK.addScriptableJavaObject("pFilter", PF);
 
        // Set rendering options - such as file or stream output, 
        // output format, whether it is embeddable, etc
        final HTMLRenderOption HTML_OPTIONS = new HTMLRenderOption();
 
        // Remove HTML and Body tags
        // HTML_OPTIONS.setEmbeddable(true);
 
        // Set output location
        HTML_OPTIONS.setOutputFileName("E:/aedms/development/aedms/aedms-reporting/target/output.html");
 
        // Set output format
        HTML_OPTIONS.setOutputFormat("html");
        
        final PDFRenderOption PDF_OPTIONS = new PDFRenderOption();
        PDF_OPTIONS.setOutputFileName("customers.pdf");
        PDF_OPTIONS.setOutputFormat("pdf");
        PDF_OPTIONS.setEmbededFont(true);
        
        TASK.setRenderOption(PDF_OPTIONS);
        
        
 
        // run the report and destroy the engine
        // Note - If the program stays resident do not shutdown the Platform or the Engine
        TASK.run();
        TASK.close();
        engine.shutdown();
        Platform.shutdown();
        System.out.println("Finished");
    }
 
    /**
     * @param ARGUMENTS
     */
    public static void main(final String[] ARGUMENTS) {
        try {
           executeReport();
        } catch (final Exception EX) {
           EX.printStackTrace();
        }
    }
}