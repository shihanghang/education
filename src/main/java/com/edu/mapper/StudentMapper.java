package com.edu.mapper;

import com.edu.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/17 20:30
 * @Description:
 */
@Mapper
public interface StudentMapper {
    public List<Student> loadAllStu();
    public int addStudent(Student student);
    public int deleStu(int id);
    public Student loadStuById(int id);
    public int updataStu(Student student);
}
