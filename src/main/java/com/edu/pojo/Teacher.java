package com.edu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZzuI
 * @Date: 2019/9/11 16:37
 * @Description: 教师表
 */
@Data
public class Teacher implements Serializable {
    private int teId;           //编号
    private String teName;      //姓名
    private String teSex;       //性别
    private int teAge;          //年龄
    private String teEducation; //学历
    private String teState;     //状态
    private String teLevel;    //级别
    private String teSubject;   //科目
    private String teTimeda;    //任职时间

    public Teacher() {
    }

    public Teacher(int teId, String teName, String teSex,
                   int teAge, String teEducation, String teState,
                   String teLeavel, String teSubject, String teTimeda) {
        this.teId = teId;
        this.teName = teName;
        this.teSex = teSex;
        this.teAge = teAge;
        this.teEducation = teEducation;
        this.teState = teState;
        this.teLevel = teLeavel;
        this.teSubject = teSubject;
        this.teTimeda = teTimeda;
    }
}
