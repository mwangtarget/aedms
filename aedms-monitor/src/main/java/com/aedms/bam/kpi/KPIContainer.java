package com.aedms.bam.kpi;

import java.util.Map;

//TODO: Refactoring to an container type
public class KPIContainer {
	private String kpiName;
	private Map<String, Long> kpiDetails;
	public KPIContainer(String kpiName, Map<String, Long> kpiDetails) {
		super();
		this.kpiName = kpiName;
		this.kpiDetails = kpiDetails;
	}
	public String getKpiName() {
		return kpiName;
	}
	public void setKpiName(String kpiName) {
		this.kpiName = kpiName;
	}
	public Map<String, Long> getKpiDetails() {
		return kpiDetails;
	}
	public void setKpiDetails(Map<String, Long> kpiDetails) {
		this.kpiDetails = kpiDetails;
	}
	
	public KPIContainer(){}
 
}
