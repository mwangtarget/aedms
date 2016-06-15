package com.aedms.core.entities.enums;

/**
 * 工程文件类型
 * 00：EO编写转发
 * 01：维修部EO转发
 * 02：器材准备转发
 * 03：EO更改通知单
 * 
 * @author jaly
 */
public enum ProjectFileType {
    EO_TRANSPOND("00","EO编写转发"), 
    MAINTAIN_TRANSPOND("01","维修部EO转发"), 
    MAT_TRANSPOND("02","器材准备转发"), 
    EO_CHANG_TRANSPOND("03","EO更改通知单");
    
    private String code;
    private String description;
    
    ProjectFileType(String code, String description) {
        this.code = code;
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public String getCode() {
        return this.code;
    }
}
