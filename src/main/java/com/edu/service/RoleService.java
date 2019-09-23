package com.edu.service;

/**
 * @Auther: ZzuI
 * @Date: 2019/9/16 20:26
 * @Description:
 */
public interface RoleService {

    /**
     * 根据id查询对应的角色名
     * @param roleId  角色id
     * @return      返回值是对应的角色名
     */
    public String loadRoleNameById(int roleId);


}
