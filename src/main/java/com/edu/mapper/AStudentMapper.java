package com.edu.mapper;

import com.edu.pojo.AStudent;
import com.edu.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/20 14:07
 * @Description:
 */
@Mapper
public interface AStudentMapper {
    public List<AStudent> loadAllAStu();
    public int addAStudent(AStudent aStudent);
    public int deleAStu(int id);
    public AStudent loadAStuById(int id);
    public int updataAStu(AStudent aStudent);
}
