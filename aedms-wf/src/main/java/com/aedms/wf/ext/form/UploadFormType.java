package com.aedms.wf.ext.form;

import java.io.File;

import org.activiti.engine.form.AbstractFormType;
import org.springframework.stereotype.Component;


@Component(value="uploadFormType")
public class UploadFormType extends AbstractFormType {

	public static final String TYPE_NAME = "uploadfile";

	@Override
	public String getName() {
		return TYPE_NAME;
	}

	@Override
	public Object convertFormValueToModelValue(String uploadFilePath) {
		File uploadFile = new File(uploadFilePath);
		if (uploadFile.exists()) {
			return uploadFilePath;
		}
		return null;
	}

	@Override
	public String convertModelValueToFormValue(Object uploadFilePath) {
		
		return (String)uploadFilePath;
	}

}
