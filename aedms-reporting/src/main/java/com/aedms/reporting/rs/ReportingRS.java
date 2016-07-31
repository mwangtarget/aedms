package com.aedms.reporting.rs;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

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
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aedms.reporting.core.ReportRequest;

@RestController

public class ReportingRS {
	private static final Logger log = LoggerFactory.getLogger(ReportingRS.class);

	@Autowired
	private IReportEngine reportEngine;

	@Autowired
	private Environment environment;
	
	@RequestMapping(value = "/reportgen", method = RequestMethod.POST)
	public ResponseEntity<byte[]>  reportGenerate(@RequestBody final ReportRequest reportRequest) {
		
		IReportRunnable reportDesign = null;
		try {
			reportDesign = reportEngine.openReportDesign(new ClassPathResource(environment.getRequiredProperty(reportRequest.getReportName())).getInputStream());
            //	reportDesign = reportEngine.openReportDesign(reportRequest.getReportName());
			
		} catch (EngineException | IllegalStateException | IOException e) {
			e.printStackTrace();
			log.error("Fail to load the report design at server side: "+e.getMessage());
			//TODO: return a valid response
			return null;
		}

		// Create task to run and render the report:
		final IRunAndRenderTask reportTask = reportEngine.createRunAndRenderTask(reportDesign);
        
		// Render option configuration
		final PDFRenderOption pdfRenderOption = new PDFRenderOption();
        pdfRenderOption.setOutputFormat("pdf");
        ByteArrayOutputStream pdfOutputStream= new ByteArrayOutputStream();
        pdfRenderOption.setOutputStream(pdfOutputStream);
        // pdfRenderOption.setOutputFileName("tmp.pdf");
        reportTask.setRenderOption(pdfRenderOption);
 
         try {
			reportTask.run();
			

			// Write the PDF stream to File.
            //	BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream("hello.pdf"));
            //	for (int i=0;i<outbytes.length;i++) {
            //			writer.write(outbytes[i]);
            //	}
            //	writer.flush();
            //	writer.close();
            //	return null;
			
			//TODO: Write back to HTTP response is not working, FIX IT.
			byte[] outbytes = pdfOutputStream.toByteArray();
			HttpHeaders headers = new HttpHeaders();
		    headers.setContentType(MediaType.parseMediaType("application/pdf"));
		    headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
			
			ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(outbytes, headers, HttpStatus.OK);
			
 			return response;
            //			return ResponseEntity
            //            .ok()
            //          .contentLength(outbytes.length)
            //            .contentType(MediaType.parseMediaType("application/pdf"))
            //            .body(outbytes);

			
		} catch (Exception e) {
			log.error("Fail to generate the report at server side: "+e.getMessage());
			//TODO: return a valid response
			return null;
		}finally{
			reportTask.close();
		}
        
        
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
