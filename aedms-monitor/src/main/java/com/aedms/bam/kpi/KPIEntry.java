package com.aedms.bam.kpi;

public class KPIEntry {
	private String label;
	private Long value;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Long getValue() {
		return value;
	}
	public void setValue(Long value) {
		this.value = value;
	}
	
	public KPIEntry(){}
	public KPIEntry(String label, Long value) {
		super();
		this.label = label;
		this.value = value;
	};
	
	

}
