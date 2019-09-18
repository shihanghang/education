package com.edu.pojo;

import java.io.Serializable;

/**
 * @Author: ZzuI
 * @Date: 2019/9/17 18:07
 * @Description:请假申请表
 */
public class Vacation implements Serializable {
    private int vaId;           //编号ID
    private String vaName;      //姓名
    private String vaContent;   //内容
    private String vaTime;      //申请时间
    private String vaState;     //状态

    public Vacation() {
    }

    public Vacation(int vaId, String vaName, String vaContent, String vaTime, String vaState) {
        this.vaId = vaId;
        this.vaName = vaName;
        this.vaContent = vaContent;
        this.vaTime = vaTime;
        this.vaState = vaState;
    }
}
