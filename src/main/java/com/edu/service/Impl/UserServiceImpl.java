package com.edu.service.Impl;

import com.edu.mapper.UsersMapper;
import com.edu.pojo.Users;
import com.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/11 18:060
 *
 * @Description: user用户的业务层实现方法
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public List<Users> findAllUsers() {
        return usersMapper.findAllUsers();
    }
    @Override
    public Users findUserByName(String userName) {
        return usersMapper.findUserByName(userName);
    }

    @Override
    public String queryRoleByName(String userName) {
        return usersMapper.queryRoleByName(userName);
    }
}
