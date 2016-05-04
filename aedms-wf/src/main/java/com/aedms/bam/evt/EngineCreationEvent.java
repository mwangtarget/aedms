package com.aedms.bam.evt;

public class EngineCreationEvent {
	
	private String engineFleet;
	private  String processInstanceId;
	private  long processedTime;
	
	public EngineCreationEvent(){};
	public EngineCreationEvent(String engineFleet, String processInstanceId, long processedTime) {
		super();
		this.engineFleet = engineFleet;
		this.processInstanceId = processInstanceId;
		this.processedTime = processedTime;
	}
	@Override
	public String toString() {
		return "EngineCreationEvent [engineFleet=" + engineFleet + ", processInstanceId=" + processInstanceId
				+ ", processedTime=" + processedTime + "]";
	}
	public String getEngineFleet() {
		return engineFleet;
	}
	public void setEngineFleet(String engineFleet) {
		this.engineFleet = engineFleet;
	}
	public String getProcessInstanceId() {
		return processInstanceId;
	}
	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}
	public long getProcessedTime() {
		return processedTime;
	}
	public void setProcessedTime(long processedTime) {
		this.processedTime = processedTime;
	}
    
	
	
}
