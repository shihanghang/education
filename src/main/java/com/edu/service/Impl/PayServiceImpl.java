package com.edu.service.Impl;

import com.edu.mapper.PayMapper;
import com.edu.pojo.Pay;
import com.edu.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/17 20:21
 * @Description:
 */

@Service
public class PayServiceImpl implements PayService {
    @Autowired
    private PayMapper payMapper;

    /**
     * 查询所有的薪资
     * @return  返回值为薪资的list
     */
    @Override
    public List<Pay> findAllPay() {
        return payMapper.findAllPay();
    }

    /**
     *添加人员薪资
     * @param pay  参数类型是人员薪资
     * @return   返回值为添加结果
     */
    @Override
    public int savePay(Pay pay) {
        return payMapper.savePay(pay);
    }

    /**
     * 根据id查询薪资对象
     * @param paId  参数类型是对象Id
     * @return   返回值是一个对象pay
     */
    @Override
    public Pay selectPayById(int paId) {
        return payMapper.selectPayById(paId);
    }

    /**
     * 修改人员薪资
     * @param pay   参数类型是人员薪资
     * @return  返回值为修改结果
     */
    @Override
    public int updatePay(Pay pay) {
        return payMapper.updatePay(pay);
    }

    /**
     * 批量删除
     * @param ids   参数类型是id集合
     * @return    返回值为删除结果
     */
    @Override
    public int deletePay(List<Integer> ids) {
        return payMapper.deletePay(ids);
    }


}
