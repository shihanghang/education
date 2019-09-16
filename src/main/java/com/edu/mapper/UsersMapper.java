package com.edu.mapper;

import com.edu.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/11 17:58
 * @Description:
 */
@Mapper
public interface UsersMapper {
    /**
     * @return 返回一个用户集合
     * 查找所有已经注册的用户
     */
    public List<Users> findAllUsers();

    /**
     * @return 返回一个用户对象
     * 在用户表按照名字检索用户的所有信息
     */
    public Users findUserByName(@Param("userName") String userName);

    /**
     * @param userName
     * @return 返回此用户的身份信息
     */
    public String queryRoleByName(@Param("userName") String userName);
}
