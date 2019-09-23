package com.edu.controller;

import com.edu.pojo.Student;
import com.edu.service.PowersService;
import com.edu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/18 14:46
 * @Description:
 */
@Controller
public class StuController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private PowersService powersService;
    @RequestMapping("stuview")
    public String stuview(Model model){
        String poName="学生管理";
        List<Student> stuall=studentService.loadAllStu();
        model.addAttribute("stuall",stuall);
        String stu=powersService.findAdressByName(poName);
        return stu;
    }
    @RequestMapping("addstu")
    public String addStu(Student student){
        int count= studentService.addStudent(student);
        return count>0?"redirect:stuview":"error";
    }
    @RequestMapping("deleteStu")
    public String deleteStu(int id){
        int i = studentService.deleStu(id);
        return i>0?"redirect:stuview":"error";
    }
    @RequestMapping("upStu")
    public  String upStu(int id,Model model){
        Student student = studentService.loadStuById(id);
        model.addAttribute("student",student);
        return "updataStu";
    }
    @RequestMapping("updataStu")
    public String updataStu(Student student){
        int i = studentService.updataStu(student);
        return i>0?"redirect:stuview":"error";
    }
}
