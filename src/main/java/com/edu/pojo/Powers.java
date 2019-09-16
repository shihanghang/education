package com.edu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZzuI
 * @Date: 2019/9/11 16:44
 * @Description: 权限表
 */
@Data
public class Powers implements Serializable {
    private int poId;       //编号
    private String poName;  //姓名

    public Powers() {
    }

    public Powers(int poId, String poName) {
        this.poId = poId;
        this.poName = poName;
    }
}
