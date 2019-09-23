package com.edu.service.Impl;

import com.edu.mapper.StudentMapper;
import com.edu.pojo.Student;
import com.edu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/17 20:38
 * @Description:
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> loadAllStu() {
        return studentMapper.loadAllStu();
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int deleStu(int id) {
        return studentMapper.deleStu(id);
    }

    @Override
    public Student loadStuById(int id) {
        return studentMapper.loadStuById(id);
    }

    @Override
    public int updataStu(Student student) {
        return studentMapper.updataStu(student);
    }
}
