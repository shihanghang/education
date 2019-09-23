package com.edu.service.Impl;

import com.edu.mapper.AttendanceMapper;
import com.edu.pojo.Attendance;
import com.edu.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/19 16:37
 * @Description:
 */
@Service
public class AttendanceServiceImpl implements AttendanceService {
    @Autowired
    private AttendanceMapper attendanceMapper;
    @Override
    public List<Attendance> laodAllAttendance() {
        return attendanceMapper.laodAllAttendance();
    }

    @Override
    public int addAttendance(Attendance attendance) {
        return attendanceMapper.addAttendance(attendance);
    }

    @Override
    public int deleAtt(int id) {
        return attendanceMapper.deleAtt(id);
    }

    @Override
    public Attendance loadAttById(int id) {
        return attendanceMapper.loadAttById(id);
    }

    @Override
    public int updataAtt(Attendance attendance) {
        return attendanceMapper.updataAtt(attendance);
    }
}
