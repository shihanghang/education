package com.edu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZzuI
 * @Date: 2019/9/11 16:40
 * @Description: 学生表
 */
@Data
public class Student implements Serializable {
    private int stId;           //编号
    private String stName;      //姓名
    private String stSex;       //性别
    private int stAge;          //年龄
    private String stGrade;     //年级
    private String stState;     //状态
    private double stTuition;   //学费
    private String stTimeda;    //报名时间

    public Student() {
    }

    public Student(int stId, String stName, String stSex,
                   int stAge, String stGrade, String stState,
                   double stTuition, String stTimeda) {
        this.stId = stId;
        this.stName = stName;
        this.stSex = stSex;
        this.stAge = stAge;
        this.stGrade = stGrade;
        this.stState = stState;
        this.stTuition = stTuition;
        this.stTimeda = stTimeda;
    }
}
