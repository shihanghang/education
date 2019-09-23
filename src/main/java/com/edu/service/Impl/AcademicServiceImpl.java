package com.edu.service.Impl;

import com.edu.mapper.AcademicMapper;
import com.edu.pojo.Academic;
import com.edu.service.AcademicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/19 16:23
 * @Description:
 */
@Service
public class AcademicServiceImpl implements AcademicService {
    @Autowired
    private AcademicMapper academicMapper;
    @Override
    public List<Academic> laodAllAcademic() {
        return academicMapper.laodAllAcademic();
    }

    @Override
    public int addAcademic(Academic Academic) {
        return academicMapper.addAcademic(Academic);
    }

    @Override
    public int deleAca(int id) {
        return academicMapper.deleAca(id);
    }

    @Override
    public Academic loadAcaById(int id) {
        return academicMapper.loadAcaById(id);
    }

    @Override
    public int updataAca(Academic academic) {
        return academicMapper.updataAca(academic);
    }
}
