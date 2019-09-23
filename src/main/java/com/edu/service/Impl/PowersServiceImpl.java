package com.edu.service.Impl;

import com.edu.mapper.PowersMapper;
import com.edu.pojo.Powers;
import com.edu.service.PowersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: ZzuI
 * @Date: 2019/9/16 20:35
 * @Description:
 */
@Service
public class PowersServiceImpl implements PowersService {
    @Autowired
    private PowersMapper powersMapper;

    /**
     * 根据id查询权限
     * @param poId   对象Id
     * @return   返回值为对象的权限信息
     */
    @Override
    public List<Powers> loadPowerByPid(List<Integer> poId) {
        return powersMapper.loadPowerByPid(poId);
    }

    /**
     * 根据名称查询对应的地址
     * @param poName    对象的名称
     * @return  返回值为对应的地址
     */
    @Override
    public String findAdressByName(String poName) {
        return powersMapper.findAdressByName(poName);
    }

    /**
     *根据权限id查询权限名
     * @param poId  参数值为权限id
     * @return  返回值为权限名
     */
    @Override
    public String findNameById(int poId){
        return powersMapper.findNameById(poId);
    }

    /**
     * 根据权限id查询对应的权限名
     * @param poId  权限id
     * @return  返回值为权限名
     */
    @Override
    public List<String> loadPnameByPid(List<Integer> poId) {
        return powersMapper.loadPnameByPid(poId);
    }













    /**
     * 查询所有的权限信息
     * @return  返回值为权限信息的list
     */
    @Override
    public List<Powers> findAllPowers() {
        return powersMapper.findAllPowers();
    }

    /**
     * 添加新的权限信息
     * @param powers    参数类型为新的权限信息
     * @return      返回值为添加的结果
     */
    @Override
    public int savePowers(Powers powers) {
        return powersMapper.savePowers(powers);
    }

    /**
     * 根据对象id查询对象的权限
     * @param poId  参数类型为对象的id
     * @return  返回值为对应对象的权限
     */
    @Override
    public Powers selectPowersById(int poId) {
        return powersMapper.selectPowersById(poId);
    }

    /**
     * 修改对象的权限信息
     * @param powers    参数为对象的权限信息
     * @return  返回值为修改的结果
     */
    @Override
    public int updatePowers(Powers powers) {
        return powersMapper.updatePowers(powers);
    }

    /**
     * 删除选中对象的权限信息
     * @param ids   参数类型为选中对象的id集合
     * @return  返回值为删除的结果
     */
    @Override
    public int deletePowers(List<Integer> ids) {
        return powersMapper.deletePowers(ids);
    }
}
