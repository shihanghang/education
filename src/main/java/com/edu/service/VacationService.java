package com.edu.service;

import com.edu.pojo.Vacation;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/20 17:57
 * @Description:
 */
public interface VacationService {
    public List<Vacation> loadAllVac();
    public int addVac(Vacation vacation);
    public int deleVac(int id);
    public Vacation loadVacById(int id);
    public int updataVac(Vacation vacation);
}
