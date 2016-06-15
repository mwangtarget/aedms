package com.aedms.core.entities.enums;

/**
 * 状态
 * O：执行中
 * C：关闭
 * @author jaly
 */
public enum MonStatus {
    O("O","执行中"),
    C("C","关闭");
    
    private String code;
    private String description;
    
    MonStatus(String code, String description) {
        this.code = code;
        this.description = description;
    }
    
    public String getCode() {return this.code;}
    
    public String getDescription() {
        return this.description;
    }
}
