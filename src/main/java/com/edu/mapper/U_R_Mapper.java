package com.edu.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/16 20:31
 * @Description:
 */
@Mapper
public interface U_R_Mapper {
    /**
     * @param userId
     * @return 根据用户id查询对应角色id
     */
    public int loadRidbyUid(int userId);


}
