package com.edu.mapper;

import com.edu.pojo.Performance;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/19 15:50
 * @Description:
 */

@Mapper
public interface PerformanceMapper {

    /**
     * 查询所有学生的成绩
     * @return   返回值为学生成绩的的list
     */
    public List<Performance> findAllPerformance();

    /**
     * 添加新的学生成绩
     * @param performance  参数类型是学生成绩
     * @return   返回值为添加结果
     */
    public int savePerformance(Performance performance);

    /**
     * 根据id查询对应学生的成绩
     * @param peId  参数类型是学生Id
     * @return   返回值是一个学生的成绩
     */
    public Performance selectPerformanceById(int peId);

    /**
     * 修改学生成绩
     * @param performance   参数类型是学生成绩
     * @return    返回值为修改结果
     */
    public int updatePerformance(Performance performance);

    /**
     * 删除所选中的学生的成绩
     * @param ids   参数类型是id集合
     * @return    返回值为删除结果
     */
    public int deletePerformance(List<Integer> ids);
}
