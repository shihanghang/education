package com.edu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/11 16:40
 * @Description: 薪资实例
 */
@Data
public class Pay implements Serializable {
    private int paId;           //编号ID
    private String paName;      //姓名
    private String paMonth;     //月份
    private double paSubwa;     //饮食补助
    private double paSubtra;    //交通补助
    private double paSubtel;    //话费补助
    private double paSubre;     //住房补助
    private double paBapay;     //基本工资
    private double paAttpay;    //出勤工资
    private double paTotal;     //总计

    public Pay() {
    }

    public Pay(int paId, String paName, String paMonth, double paSubwa,
               double paSubtra, double paSubtel, double paSubre, double paBapay,
               double paAttpay, double paTotal) {
        this.paId = paId;
        this.paName = paName;
        this.paMonth = paMonth;
        this.paSubwa = paSubwa;
        this.paSubtra = paSubtra;
        this.paSubtel = paSubtel;
        this.paSubre = paSubre;
        this.paBapay = paBapay;
        this.paAttpay = paAttpay;
        this.paTotal = paTotal;
    }
}
