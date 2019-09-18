package com.edu.mapper;

import com.edu.pojo.Pay;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/17 20:18
 * @Description:
 */

@Mapper
public interface PayMapper {
    /**
     * 查询所有人员的薪资
     * @return   返回值为薪资的list
     */
    public List<Pay> findAllPay();

    /**
     * 添加新的人员薪资
     * @param pay  参数类型是人员薪资
     * @return   返回值为添加结果
     */
    public int savePay(Pay pay);

    /**
     * 根据id查询薪资对象
     * @param paId  参数类型是对象Id
     * @return   返回值是一个对象pay
     */
    public Pay selectPayById(int paId);

    /**
     * 修改薪资
     * @param pay   参数类型是人员薪资
     * @return    返回值为修改结果
     */
    public int updatePay(Pay pay);

    /**
     * 批量删除
     * @param ids   参数类型是id集合
     * @return    返回值为删除结果
     */
    public int deletePay(List<Integer> ids);
}
