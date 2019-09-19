package com.edu.service.Impl;

import com.edu.mapper.ExpensesMapper;
import com.edu.pojo.Expenses;
import com.edu.service.ExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/18 20:47
 * @Description:
 */
@Service
public class ExpensesServiceImpl implements ExpensesService {
    @Autowired
    private ExpensesMapper expensesMapper;

    /**
     * 查询所有人员的报销信息
     * @return   返回值为人员报销的list
     */
    @Override
    public List<Expenses> findAllExpenses() {
        return expensesMapper.findAllExpenses();
    }

    /**
     * 添加新的人员报销信息
     * @param expenses 参数类型是人员报销
     * @return   返回值为添加结果
     */
    @Override
    public int saveExpenses(Expenses expenses) {
        return expensesMapper.saveExpenses(expenses);
    }

    /**
     * 根据id查询报销信息
     * @param exId  参数类型是对象Id
     * @return   返回值是一个对象报销
     */
    @Override
    public Expenses selectExpensesById(int exId) {
        return expensesMapper.selectExpensesById(exId);
    }

    /**
     * 修改报销信息
     * @param expenses   参数类型是人员报销信息
     * @return    返回值为修改结果
     */
    @Override
    public int updateExpenses(Expenses expenses) {
        return expensesMapper.updateExpenses(expenses);
    }

    /**
     * 批量删除报销信息
     * @param ids   参数类型是id集合
     * @return    返回值为删除结果
     */
    @Override
    public int deleteExpenses(List<Integer> ids) {
        return expensesMapper.deleteExpenses(ids);
    }
}
