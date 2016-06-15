package com.aedms.core.entities.enums;

/**
 * For EFF_BY_EO
 * 此EO影响到的项目的类型
 * A：飞  机
 * E：发动机
 * 
 * @author jaly
 */
public enum EOEffectType {
    A("A","飞机"),
    E("E","发动机");
    
    private String code;
    private String description;
    
    EOEffectType(String code, String description) {
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
