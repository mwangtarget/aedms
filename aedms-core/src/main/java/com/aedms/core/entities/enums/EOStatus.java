package com.aedms.core.entities.enums;

/**
 * 非重检：
 * 例子： O： EO没有执行完；C：全部执行完毕
 * 
 * 重检：
 * 例子： O： 一架飞机都没有执行；  R ：至少有一架飞机执行完；C：全部执行完毕【人工触发】
 * 
 * @author jaly
 */
public enum EOStatus {
    O_NotRepeat("O","EO没有执行完"),
    O_Repeat("O","一架飞机都没有执行"),
    R("R","至少有一架飞机执行完"),
    C("C","全部执行完毕");
    
    private String code;
    private String description;
    
    EOStatus(String code, String description) {
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
