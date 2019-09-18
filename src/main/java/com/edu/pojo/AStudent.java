package com.edu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZzuI
 * @Date: 2019/9/17 17:54
 * @Description:学生出勤表
 */
@Data
public class AStudent implements Serializable {
    private int asId;       //编号
    private String asName;  //姓名
    private int asWorkday;  //出勤天数
    private int asLeaveday; //请假天数
    private String asState; //状态

    public AStudent() {
    }

    public AStudent(int asId, String asName, int asWorkday, int asLeaveday, String asState) {
        this.asId = asId;
        this.asName = asName;
        this.asWorkday = asWorkday;
        this.asLeaveday = asLeaveday;
        this.asState = asState;
    }
}
