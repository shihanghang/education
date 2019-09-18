package com.edu.service;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/16 20:31
 * @Description:
 */
public interface U_R_Service {
    /**
     * @param userId
     * @return 根据用户id查询对应角色id
     */
    public int loadRidbyUid(int userId);
}
