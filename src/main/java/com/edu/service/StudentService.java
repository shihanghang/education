package com.edu.service;

import com.edu.pojo.Student;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/17 20:37
 * @Description:
 */
public interface StudentService {
    public List<Student> loadAllStu();
    public int addStudent(Student student);
    public int deleStu(int id);
    public Student loadStuById(int id);
    public int updataStu(Student student);
}
