package com.edu.mapper;

import com.edu.pojo.Academic;
import com.edu.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/19 16:22
 * @Description: 教务
 */
@Mapper
public interface AcademicMapper {
    public List<Academic> laodAllAcademic();
    public int addAcademic(Academic Academic);
    public int deleAca(int id);
    public Academic loadAcaById(int id);
    public int updataAca(Academic academic);
}
