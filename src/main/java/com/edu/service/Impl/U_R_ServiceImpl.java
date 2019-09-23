package com.edu.service.Impl;

import com.edu.mapper.U_R_Mapper;
import com.edu.service.U_R_Service;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/16 20:31
 * @Description:
 */
@Service
public class U_R_ServiceImpl implements U_R_Service {
    @Autowired
    private U_R_Mapper u_r_mapper;

    @Override
    public int loadRidbyUid(int userId) {
        return u_r_mapper.loadRidbyUid(userId);
    }
}
