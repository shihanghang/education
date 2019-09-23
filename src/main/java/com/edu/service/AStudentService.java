package com.edu.service;

import com.edu.pojo.AStudent;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/20 14:09
 * @Description:
 */
public interface AStudentService {
    public List<AStudent> loadAllAStu();
    public int addAStudent(AStudent aStudent);
    public int deleAStu(int id);
    public AStudent loadAStuById(int id);
    public int updataAStu(AStudent aStudent);
}
