package com.edu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/11 16:37
 * @Description: 人力表实例
 */
@Data
public class Manpower implements Serializable {
    private int maId;               //编号
    private String maLicati;        //申请时间
    private String maApplicant;     //申请人
    private String maInfo;          //描述
    private String maTel;           //联系电话
    private String maState;         //状态

    public Manpower() {
    }

    public Manpower(int maId, String maLicati, String maApplicant,
                    String maInfo, String maTel, String maState) {
        this.maId = maId;
        this.maLicati = maLicati;
        this.maApplicant = maApplicant;
        this.maInfo = maInfo;
        this.maTel = maTel;
        this.maState = maState;
    }
}
