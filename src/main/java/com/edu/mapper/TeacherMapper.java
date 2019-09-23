package com.edu.mapper;

import com.edu.pojo.Student;
import com.edu.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/19 09:26
 * @Description:
 */
@Mapper
public interface TeacherMapper {
    public List<Teacher> laodAllTeacher();
    public int addTeacher(Teacher teacher);
    public int deleTea(int id);
    public Teacher loadTeaById(int id);
    public int updataTea(Teacher teacher);
}
