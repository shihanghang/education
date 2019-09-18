package com.edu.service.Impl;

import com.edu.mapper.R_P_Mapper;
import com.edu.service.R_P_Service;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/16 20:30
 * @Description: 角色和权限关系表DAO
 */
@Service
public class R_P_ServiceImpl implements R_P_Service {
    @Autowired
    private R_P_Mapper r_p_mapper;
    @Override
    public List<Integer> loadPidByRid(int roleId) {
        return r_p_mapper.loadPidByRid(roleId);
    }
}
