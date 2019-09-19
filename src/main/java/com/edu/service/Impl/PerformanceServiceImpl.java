package com.edu.service.Impl;

import com.edu.mapper.PerformanceMapper;
import com.edu.pojo.Performance;
import com.edu.service.PerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/19 15:56
 * @Description:
 */
@Service
public class PerformanceServiceImpl implements PerformanceService {
    @Autowired
    private PerformanceMapper performanceMapper;

    /**
     * 查询所有学生的成绩
     * @return   返回值为学生成绩的的list
     */
    @Override
    public List<Performance> findAllPerformance() {
        return performanceMapper.findAllPerformance();
    }

    /**
     * 添加新的学生成绩
     * @param performance  参数类型是学生成绩
     * @return   返回值为添加结果
     */
    @Override
    public int savePerformance(Performance performance) {
        return performanceMapper.savePerformance(performance);
    }

    /**
     * 根据id查询对应学生的成绩
     * @param peId  参数类型是学生Id
     * @return   返回值是一个学生的成绩
     */
    @Override
    public Performance selectPerformanceById(int peId) {
        return performanceMapper.selectPerformanceById(peId);
    }

    /**
     * 修改学生成绩
     * @param performance   参数类型是学生成绩
     * @return    返回值为修改结果
     */
    @Override
    public int updatePerformance(Performance performance) {
        return performanceMapper.updatePerformance(performance);
    }

    /**
     * 删除所选中的学生的成绩
     * @param ids   参数类型是id集合
     * @return    返回值为删除结果
     */
    @Override
    public int deletePerformance(List<Integer> ids) {
        return performanceMapper.deletePerformance(ids);
    }
}
