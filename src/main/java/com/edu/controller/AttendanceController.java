package com.edu.controller;

import com.edu.pojo.Attendance;
import com.edu.pojo.Student;
import com.edu.service.AttendanceService;
import com.edu.service.PowersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/19 16:40
 * @Description:
 */
@Controller
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;
    @Autowired
    private PowersService powersService;
    @RequestMapping("attview")
    public String attview(Model model){
        String poName="教师出勤";
        List<Attendance> attendances = attendanceService.laodAllAttendance();
        model.addAttribute("attendances",attendances);
        String att=powersService.findAdressByName(poName);
        return att;
    }
    @RequestMapping("addAtt")
    public String addAtt(Attendance attendance){
        System.out.println(attendance+"Add添加");
        int i = attendanceService.addAttendance(attendance);
        return i>0?"redirect:attview":"error";
    }
    @RequestMapping("deleteAtt")
    public String deleteAtt(int id){
        int i = attendanceService.deleAtt(id);
        return i>0?"redirect:attview":"error";
    }
    @RequestMapping("upAtt")
    public  String upAtt(int id, Model model){
        Attendance attendance = attendanceService.loadAttById(id);
        model.addAttribute("attendance",attendance);
        System.out.println(attendance+"出勤");
        return "updateAtt";
    }
    @RequestMapping("updateAtt")
    public String updateAtt(Attendance attendance){
        int i = attendanceService.updataAtt(attendance);
        return i>0?"redirect:attview":"error";
    }
}
