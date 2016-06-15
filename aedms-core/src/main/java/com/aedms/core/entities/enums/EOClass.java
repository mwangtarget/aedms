package com.aedms.core.entities.enums;

/**
 *  紧急、一般
 * @author jaly
 */
public enum EOClass {
    URGENCY("紧急"),
    GENERAL("一般");
    
    private String description ;
    
    EOClass(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }
}
