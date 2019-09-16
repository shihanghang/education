package com.edu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/11 16:27
 * @Description: 出勤表实例
 */
@Data
public class Attendance implements Serializable {
    private int atId;       //编号
    private String atName;  //姓名
    private int atWorkday;  //出勤天数
    private int atLeaveday; //请假天数
    private String atState; //状态

    public Attendance() {
    }

    public Attendance(int atId, String atName, int atWorkday, int atLeaveday, String atState) {
        this.atId = atId;
        this.atName = atName;
        this.atWorkday = atWorkday;
        this.atLeaveday = atLeaveday;
        this.atState = atState;
    }
}
