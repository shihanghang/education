package com.edu.service.Impl;

import com.edu.mapper.AStudentMapper;
import com.edu.pojo.AStudent;
import com.edu.service.AStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/20 14:09
 * @Description:
 */
@Service
public class AStudentServiceImpl implements AStudentService {
    @Autowired
    private AStudentMapper aStudentMapper;
    @Override
    public List<AStudent> loadAllAStu() {
        return aStudentMapper.loadAllAStu();
    }

    @Override
    public int addAStudent(AStudent aStudent) {
        return aStudentMapper.addAStudent(aStudent);
    }

    @Override
    public int deleAStu(int id) {
        return aStudentMapper.deleAStu(id);
    }

    @Override
    public AStudent loadAStuById(int id) {
        return aStudentMapper.loadAStuById(id);
    }

    @Override
    public int updataAStu(AStudent aStudent) {
        return aStudentMapper.updataAStu(aStudent);
    }
}
