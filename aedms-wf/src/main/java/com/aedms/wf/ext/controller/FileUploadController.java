package com.aedms.wf.ext.controller;

import org.apache.chemistry.opencmis.client.api.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.aedms.wf.ext.cmis.CMISResp;
import com.aedms.wf.ext.cmis.CMISSessionUtil;
import com.google.common.io.ByteStreams;


@RestController
public class FileUploadController {

	private static final Logger log = LoggerFactory.getLogger(FileUploadController.class);

	@Autowired
	CMISSessionUtil cmisSessionUtil;

	@RequestMapping(method = RequestMethod.POST, value = "/upload")
	public CMISResp handleFileUpload(@RequestParam("filename") String name,
								   @RequestParam("file") MultipartFile file) {
		
		// If fileNmae had "/", reject.
		//TODO: move this to client side.
		if (name.contains("/")) {
			return new CMISResp(name, "", false);
		}
		
		if (!file.isEmpty()) {
			try {
				Document cmisDocument = cmisSessionUtil.createDocument(name, ByteStreams.toByteArray(file.getInputStream()));
				log.info("Upload File to CMIS server succeed: "+ cmisDocument.getContentUrl());
				return new CMISResp(name, cmisDocument.getContentUrl(), true);
			}
			catch (Exception e) {
				log.error("Fail to upload to document server");
				return new CMISResp(name, "", false);
			}
		}
		else {
			log.error("File is empty, fail to upload to document server");
			return new CMISResp(name, "", false);
		}
	}

}