package com.aedms.wf.ext.cmis;

/**
 * 
 * Representing the CMIS response
 * 
 * @author Michael
 *
 */
public class CMISResp {
	
	//TODO: Change to Builder pattern
	public CMISResp(String filename, String cmisLocation, boolean isSaved){
		this.filename = filename;
		this.cmisLocation = cmisLocation;
		this.isSaved = isSaved;
	}
	
	@Override
	public String toString() {
		return "CMISResp [filename=" + filename + ", cmisLocation=" + cmisLocation + ", isSaved=" + isSaved + "]";
	}

	private String filename;
	private String cmisLocation;
	private boolean isSaved;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getCmisLocation() {
		return cmisLocation;
	}

	public void setCmisLocation(String cmisLocation) {
		this.cmisLocation = cmisLocation;
	}

	public boolean isSaved() {
		return isSaved;
	}

	public void setSaved(boolean isSaved) {
		this.isSaved = isSaved;
	}
	

}
