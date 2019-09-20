package com.edu.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: ZzuI
 * @Date: 2019/9/17 18:10
 * @Description:离职申请表
 */
@Data
public class Quits implements Serializable {
    private int quId;           //编号ID
    private String quName;      //姓名
    private String quContent;   //内容
    private String quTime;        //申请时间
    private String quState;     //状态

    public Quits() {
    }

    public Quits(int quId, String quName, String quContent, String quTime, String quState) {
        this.quId = quId;
        this.quName = quName;
        this.quContent = quContent;
        this.quTime = quTime;
        this.quState = quState;
    }
}
