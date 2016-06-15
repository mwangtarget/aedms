package com.aedms.core.entities.enums;

/**
 * For EO_POSTPONEMENT / EO_REV / EO_PRO_REPORT
 * 
 * @author jaly
 */
public enum EOGeneralStatus {
    O("O","处理中"),
    C("C","关闭");
    
    private String code;
    private String description;
    
    EOGeneralStatus(String code, String description){
        this.code = code;
        this.description = description;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public String getDescription() {
        return this.description;
    }
}
