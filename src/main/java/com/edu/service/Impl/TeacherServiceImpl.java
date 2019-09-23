package com.edu.service.Impl;

import com.edu.mapper.TeacherMapper;
import com.edu.pojo.Teacher;
import com.edu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/19 09:54
 * @Description:
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public List<Teacher> laodAllTeacher() {
        return teacherMapper.laodAllTeacher();
    }

    @Override
    public int addTeacher(Teacher teacher) {
        return teacherMapper.addTeacher(teacher);
    }

    @Override
    public int deleTea(int id) {
        return teacherMapper.deleTea(id);
    }

    @Override
    public Teacher loadTeaById(int id) {
        return teacherMapper.loadTeaById(id);
    }

    @Override
    public int updataTea(Teacher teacher) {
        return teacherMapper.updataTea(teacher);
    }
}
