package com.aedms.core.entities.enums;

/**
 * D检执行、送厂执行、航线/定捡完成、加入方案、单控项目、长期有效、手册修订 
 * @author jaly
 */
public enum EOActionType {
    D_CHECK_EXECUTION("D检执行"),
    FACTORY_EXECUTION("送厂执行"),
    LINE_CHECK_COMPLETE("航线/定捡完成"),
    APPEND_SOLUTION("加入方案"),
    SINGLE_CONTROL_PROJECT("单控项目"),
    LONG_TERM_EFFECT("长期有效"),
    MANUAL_REVISION("手册修订");
    
    private String description;
    
    EOActionType(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }
}
