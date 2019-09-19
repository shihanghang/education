package com.edu.mapper;

import com.edu.pojo.Expenses;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/18 20:40
 * @Description:
 */
@Mapper
public interface ExpensesMapper {
    /**
     * 查询所有人员的报销信息
     * @return   返回值为人员报销的list
     */
    public List<Expenses> findAllExpenses();

    /**
     * 添加新的人员报销信息
     * @param expenses 参数类型是人员报销
     * @return   返回值为添加结果
     */
    public int saveExpenses(Expenses expenses);

    /**
     * 根据id查询报销信息
     * @param exId  参数类型是对象Id
     * @return   返回值是一个对象报销
     */
    public Expenses selectExpensesById(int exId);

    /**
     * 修改报销信息
     * @param expenses   参数类型是人员报销信息
     * @return    返回值为修改结果
     */
    public int updateExpenses(Expenses expenses);

    /**
     * 批量删除报销信息
     * @param ids   参数类型是id集合
     * @return    返回值为删除结果
     */
    public int deleteExpenses(List<Integer> ids);

}
