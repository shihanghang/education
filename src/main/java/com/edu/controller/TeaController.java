package com.edu.controller;

import com.edu.pojo.Student;
import com.edu.pojo.Teacher;
import com.edu.service.PowersService;
import com.edu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/19 09:57
 * @Description:
 */
@Controller
public class TeaController {
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private PowersService powersService;
    @RequestMapping("teaview")
    public  String teaview(Model model){
        String poName="教师管理";
        List<Teacher> teachers = teacherService.laodAllTeacher();
        String tea = powersService.findAdressByName(poName);
        model.addAttribute("teachers",teachers);
        return tea;
    }
    @RequestMapping("addtea")
    public String addStu(Teacher teacher){
        int count= teacherService.addTeacher(teacher);
        return count>0?"redirect:teaview":"error";
    }
    @RequestMapping("deletea")
    public String deletea(int id){
        int i = teacherService.deleTea(id);
        return i>0?"redirect:teaview":"error";
    }
    @RequestMapping("upTea")
    public  String upTea(int id,Model model){
        Teacher teacher = teacherService.loadTeaById(id);
        model.addAttribute("teacher",teacher);
        return "updateTea";
    }
    @RequestMapping("updataTea")
    public String updataStu(Teacher teacher){
        int i = teacherService.updataTea(teacher);
        return i>0?"redirect:teaview":"error";
    }
}
