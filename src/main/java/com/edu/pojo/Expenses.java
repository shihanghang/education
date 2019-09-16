package com.edu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/11 16:33
 * @Description:    报销表实例
 */
@Data
public class Expenses implements Serializable {
    private int exId;           //编号
    private double exWater;     //水费
    private double exElectric;  //电费
    private double exRent;      //房租
    private double exProperty;  //物业
    private double exLogistics; //后勤
    private String exInfo;      //申报人
    private String exState;     //状态

    public Expenses() {
    }

    public Expenses(int exId, double exWater, double exElectric, double exRent, double exProperty,
                    double exLogistics, String exInfo, String exState) {
        this.exId = exId;
        this.exWater = exWater;
        this.exElectric = exElectric;
        this.exRent = exRent;
        this.exProperty = exProperty;
        this.exLogistics = exLogistics;
        this.exInfo = exInfo;
        this.exState = exState;
    }
}
