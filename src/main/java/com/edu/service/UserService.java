package com.edu.service;

import com.edu.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/11 18:06
 * @Description:
 */
public interface UserService {
    /**
     * @return 返回一个用户集合
     * 查找所有已经注册的用户
     */
    public List<Users> findAllUsers();

    /**
     * @return 返回一个用户对象
     * 在用户表按照名字检索用户的所有信息
     */
    public Users findUserByName(String userName);
}
