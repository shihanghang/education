package com.edu.service.Impl;

import com.edu.mapper.VacationMapper;
import com.edu.pojo.Vacation;
import com.edu.service.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/20 17:57
 * @Description:
 */
@Service
public class VacationServiceImpl  implements VacationService {
    @Autowired
    private VacationMapper vacationMapper;
    @Override
    public List<Vacation> loadAllVac() {
        return vacationMapper.loadAllVac();
    }

    @Override
    public int addVac(Vacation vacation) {
        return vacationMapper.addVac(vacation);
    }

    @Override
    public int deleVac(int id) {
        return vacationMapper.deleVac(id);
    }

    @Override
    public Vacation loadVacById(int id) {
        return vacationMapper.loadVacById(id);
    }

    @Override
    public int updataVac(Vacation vacation) {
        return vacationMapper.updataVac(vacation);
    }
}
