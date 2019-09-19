package com.edu.service;

import com.edu.pojo.Manpower;

import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/19 9:58
 * @Description:
 */
public interface ManPowerService {
    /**
     * 查询所有的人力申请
     * @return  返回的是所有的人力申请list
     */
    public List<Manpower> findAllManPower();

    /**
     * 添加新的人力申请
     * @param manpower   参数为一个人的人力申请
     * @return  返回值是添加的结果
     */
    public int saveManPower(Manpower manpower);

    /**
     * 根据id查询对象的人力申请
     * @param maId  参数为一个对象的人力申请的id
     * @return   返回值为这个对象的人力申请详情
     */
    public Manpower selectManPowerById(int maId);

    /**
     * 修改对象的人力申请
     * @param manpower  参数为对象的人力申请
     * @return    返回值为修改的结果
     */
    public int updateManPower(Manpower manpower);

    /**
     * 删除所选对象的人力申请
     * @param ids  参数为所选的中的对象的人力申请对应的id集合
     * @return    返回值为删除的结果
     */
    public int deleteManPower(List<Integer> ids);
}
