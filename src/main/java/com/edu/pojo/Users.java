package com.edu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZzuI
 * @Date: 2019/9/11 16:33
 * @Description: 用户表
 */
@Data
public class Users implements Serializable {
    private int userId;         //编号
    private String userName;    //用户名
    private String password;    //密码
    private String nickName;    //昵称
    private String email;       //邮箱
    private String state;       //状态

    public Users() {
    }

    public Users(int userId, String userName, String password,
                 String nickName, String email, String state) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
        this.email = email;
        this.state = state;
    }
}
