package com.edu.service.Impl;

import com.edu.mapper.RoleMapper;
import com.edu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: ZzuI
 * @Date: 2019/9/16 20:26
 * @Description:
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    /**
     * 根据id查询对应的角色名
     * @param roleId  角色id
     * @return      返回值是对应的角色名
     */
    @Override
    public String loadRoleNameById(int roleId) {
        return roleMapper.loadRoleNameById(roleId);
    }
}
