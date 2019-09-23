package com.edu.mapper;

import com.edu.pojo.Academic;
import com.edu.pojo.Attendance;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/19 16:36
 * @Description: 教师出勤
 */
@Mapper
public interface AttendanceMapper {
    public List<Attendance> laodAllAttendance();
    public int addAttendance(Attendance attendance);
    public int deleAtt(int id);
    public Attendance loadAttById(int id);
    public int updataAtt(Attendance attendance);
}
