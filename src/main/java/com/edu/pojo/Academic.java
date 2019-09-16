package com.edu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/11 16:22
 * @Description: 教务实例
 */
@Data
public class Academic implements Serializable {
    private int acId;           //编号ID
    private String acCourse;    //科目
    private String acType;      //类型
    private String acGrade;     //适用年级
    private String acState;     //状态

    public Academic() {
    }

    public Academic(int acId, String acCourse, String acType, String acGrade, String acState) {
        this.acId = acId;
        this.acCourse = acCourse;
        this.acType = acType;
        this.acGrade = acGrade;
        this.acState = acState;
    }
}
