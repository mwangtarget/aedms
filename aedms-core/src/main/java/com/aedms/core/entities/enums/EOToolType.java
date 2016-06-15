package com.aedms.core.entities.enums;

/**
 *
 * @author jaly
 */
public enum EOToolType {
    T("T","工具"),
    E("E", "设备");
    
    private String code;
    private String description;
    
    EOToolType(String code, String description) {
        this.code = code;
        this.description = description;
    }
    
    public String getCode(){
        return this.code;
    }
    
    public String getDescription() {
        return this.description;
    }
}
