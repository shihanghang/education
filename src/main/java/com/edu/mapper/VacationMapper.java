package com.edu.mapper;

import com.edu.pojo.Vacation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/20 17:40
 * @Description:
 */
@Mapper
public interface VacationMapper {
    public List<Vacation> loadAllVac();
    public int addVac(Vacation vacation);
    public int deleVac(int id);
    public Vacation loadVacById(int id);
    public int updataVac(Vacation vacation);
}
