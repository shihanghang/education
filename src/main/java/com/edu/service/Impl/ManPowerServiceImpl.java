package com.edu.service.Impl;

import com.edu.mapper.ManPowerMapper;
import com.edu.pojo.Manpower;
import com.edu.service.ManPowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/19 10:00
 * @Description:
 */
@Service
public class ManPowerServiceImpl implements ManPowerService {
    @Autowired
    private ManPowerMapper manPowerMapper;

    /**
     * 查询所有的人力申请
     * @return  返回的是所有的人力申请list
     */
    @Override
    public List<Manpower> findAllManPower() {
        return manPowerMapper.findAllManPower();
    }

    /**
     * 添加新的人力申请
     * @param manpower   参数为一个人的人力申请
     * @return  返回值是添加的结果
     */
    @Override
    public int saveManPower(Manpower manpower) {
        return manPowerMapper.saveManPower(manpower);
    }

    /**
     * 根据id查询对象的人力申请
     * @param maId  参数为一个对象的人力申请的id
     * @return   返回值为这个对象的人力申请详情
     */
    @Override
    public Manpower selectManPowerById(int maId) {
        return manPowerMapper.selectManPowerById(maId);
    }

    /**
     * 修改对象的人力申请
     * @param manpower  参数为对象的人力申请
     * @return    返回值为修改的结果
     */
    @Override
    public int updateManPower(Manpower manpower) {
        return manPowerMapper.updateManPower(manpower);
    }

    /**
     * 删除所选对象的人力申请
     * @param ids  参数为所选的中的对象的人力申请对应的id集合
     * @return    返回值为删除的结果
     */
    @Override
    public int deleteManPower(List<Integer> ids) {
        return manPowerMapper.deleteManPower(ids);
    }
}
