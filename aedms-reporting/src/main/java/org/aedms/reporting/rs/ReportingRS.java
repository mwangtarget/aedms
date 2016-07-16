package org.aedms.reporting.rs;

import org.aedms.reporting.core.ReportRequest;
import org.eclipse.birt.report.engine.api.EngineException;
import org.eclipse.birt.report.engine.api.HTMLRenderOption;
import org.eclipse.birt.report.engine.api.IReportEngine;
import org.eclipse.birt.report.engine.api.IReportRunnable;
import org.eclipse.birt.report.engine.api.IRunAndRenderTask;
import org.eclipse.birt.report.engine.api.PDFRenderOption;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ReportingRS {
	private static final Logger log = LoggerFactory.getLogger(ReportingRS.class);

	@Autowired
	private IReportEngine reportEngine;

	@Autowired
	private Environment environment;
	
	@RequestMapping(value = "/reportgen", method = RequestMethod.POST)
	public void reportGenerate(@RequestBody final ReportRequest reportRequest) {
		
		IReportRunnable reportDesign = null;
		try {
			reportDesign = reportEngine.openReportDesign(this.getClass().getResourceAsStream(environment.getRequiredProperty(reportRequest.getReportName())));
            //	reportDesign = reportEngine.openReportDesign(reportRequest.getReportName());
			
		} catch (EngineException e) {
			e.printStackTrace();
			log.error("Fail to load the report design at server side: "+e.getMessage());
			return;
		}

		// Create task to run and render the report:
		final IRunAndRenderTask reportTask = reportEngine.createRunAndRenderTask(reportDesign);
        
		// Render option configuration
		final PDFRenderOption pdfRenderOption = new PDFRenderOption();
        pdfRenderOption.setOutputFormat("pdf");
        pdfRenderOption.setOutputFileName("cusomers.pdf");
        reportTask.setRenderOption(pdfRenderOption);
 
        try {
			reportTask.run();
		} catch (EngineException e) {
			log.error("Fail to generate the report at server side: "+e.getMessage());
			return;
		}
        reportTask.close();
	}
	
	//TODO: remove it
	@RequestMapping(value = "/reportrequest", method = RequestMethod.GET)
	public ReportRequest getReportRequest() {
		ReportRequest reportRequest = new ReportRequest();
		reportRequest.setReportName("engines");
		reportRequest.setReportParm1("name");
		return reportRequest;

	}

}
