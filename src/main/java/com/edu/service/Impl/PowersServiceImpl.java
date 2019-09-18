package com.edu.service.Impl;

import com.edu.mapper.PowersMapper;
import com.edu.pojo.Powers;
import com.edu.service.PowersService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/16 20:35
 * @Description:
 */
@Service
public class PowersServiceImpl implements PowersService {
    @Autowired
    private PowersMapper powersMapper;
    @Override
    public List<Powers> loadPowerByPid(List<Integer> poId) {
        return powersMapper.loadPowerByPid(poId);
    }

    @Override
    public String findAdressByName(String poName) {
        return powersMapper.findAdressByName(poName);
    }
}
