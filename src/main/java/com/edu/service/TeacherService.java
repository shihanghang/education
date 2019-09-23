package com.edu.service;

import com.edu.pojo.Teacher;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/19 09:53
 * @Description:
 */
public interface TeacherService {
    public List<Teacher> laodAllTeacher();
    public int addTeacher(Teacher teacher);
    public int deleTea(int id);
    public Teacher loadTeaById(int id);
    public int updataTea(Teacher teacher);
}
