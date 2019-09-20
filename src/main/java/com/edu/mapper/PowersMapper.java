package com.edu.mapper;

import com.edu.pojo.Powers;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: ZzuI
 * @Date: 2019/9/16 20:35
 * @Description:
 */
@Mapper
public interface PowersMapper {
    /**
     * 根据id查询权限
     * @param poId   对象Id
     * @return   返回值为对象的权限信息
     */
    public List<Powers> loadPowerByPid(List<Integer> poId);

    /**
     * 根据名称查询对应的地址
     * @param poName    对象的名称
     * @return  返回值为对应的地址
     */
    public String findAdressByName(String poName);

    /**
     * 查询所有的权限信息
     * @return  返回值为权限信息的list
     */
    public List<Powers> findAllPowers();

    /**
     * 添加新的权限信息
     * @param powers    参数类型为新的权限信息
     * @return      返回值为添加的结果
     */
    public int savePowers(Powers powers);

    /**
     * 根据对象id查询对象的权限
     * @param poId  参数类型为对象的id
     * @return  返回值为对应对象的权限
     */
    public Powers selectPowersById(int poId);

    /**
     * 修改对象的权限信息
     * @param powers    参数为对象的权限信息
     * @return  返回值为修改的结果
     */
    public int updatePowers(Powers powers);

    /**
     * 删除选中对象的权限信息
     * @param ids   参数类型为选中对象的id集合
     * @return  返回值为删除的结果
     */
    public int deletePowers(List<Integer> ids);

}
