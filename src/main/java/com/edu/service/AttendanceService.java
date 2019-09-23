package com.edu.service;

import com.edu.pojo.Attendance;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/19 16:37
 * @Description:
 */
public interface AttendanceService {
    public List<Attendance> laodAllAttendance();
    public int addAttendance(Attendance attendance);
    public int deleAtt(int id);
    public Attendance loadAttById(int id);
    public int updataAtt(Attendance attendance);
}
