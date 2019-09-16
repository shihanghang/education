package com.edu.pojo;

import java.io.Serializable;

/**
 * @Author: ZzuI
 * @Date: 2019/9/16 20:29
 * @Description:
 */
public class Roles implements Serializable {
    private int roleId;         //编号
    private String roleName;    //名称

    public Roles() {
    }

    public Roles(int roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }
}
