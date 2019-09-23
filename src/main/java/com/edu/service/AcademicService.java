package com.edu.service;

import com.edu.pojo.Academic;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/19 16:22
 * @Description:
 */
public interface AcademicService {
    public List<Academic> laodAllAcademic();
    public int addAcademic(Academic Academic);
    public int deleAca(int id);
    public Academic loadAcaById(int id);
    public int updataAca(Academic academic);
}
