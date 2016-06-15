package com.aedms.core.entities.enums;

/**
 * 一共7种: 重要修理、重要改装、检查、评估、修理、改装、其他
 * 
 * @author jaly
 */
public enum EOType {
    IMPORTANT_MAINTAIN("重要修理"),
    IMPORTANT_REFIT("重要改装"),
    CHECK("检查"),
    ASSESSMENT("评估"),
    MAINTAIN("修理"),
    REFIT("改装"),
    OTHER("其他");
    
    private String description;
    
    EOType(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }
}
