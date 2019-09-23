package com.edu.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/16 20:30
 * @Description: 角色和权限关系表DAO
 */
@Mapper
public interface R_P_Mapper {
    /**
     * @param roleId
     * @return 根据用户对应的角色id查询用户对应的权限功能id
     */
    public List<Integer> loadPidByRid(int roleId);


}
