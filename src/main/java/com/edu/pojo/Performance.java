package com.edu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/11 16:42
 * @Description: 成绩表
 */
@Data
public class Performance implements Serializable {
    private int peId;                   //编号ID
    private String peName;              //姓名（学生）
    private String peCourse;            //科目
    private double peAchievement;       //成绩
    private String peInfo;              //备注
    private String peState;             //状态

    public Performance() {
    }

    public Performance(int peId, String peName, String peCourse,
                       double peAchievement, String peInfo, String peState) {
        this.peId = peId;
        this.peName = peName;
        this.peCourse = peCourse;
        this.peAchievement = peAchievement;
        this.peInfo = peInfo;
        this.peState = peState;
    }
}
