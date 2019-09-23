package com.edu.controller;

import com.edu.pojo.AStudent;
import com.edu.service.AStudentService;
import com.edu.service.PowersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/20 14:16
 * @Description:
 */
@Controller
public class AStudentController {
    @Autowired
    private AStudentService astudentService;
    @Autowired
    private PowersService powersService;
    @RequestMapping("Astuview")
    public String Astuview(Model model){
        String poName="学生出勤";
        List<AStudent> astuall=astudentService.loadAllAStu();
        model.addAttribute("astuall",astuall);
        String astu=powersService.findAdressByName(poName);
        return astu;
    }
    @RequestMapping("addAstu")
    public String addAStu(AStudent astudent){
        int count= astudentService.addAStudent(astudent);
        return count>0?"redirect:Astuview":"error";
    }
    @RequestMapping("deleteAStu")
    public String deleteAStu(int id){
        int i = astudentService.deleAStu(id);
        return i>0?"redirect:Astuview":"error";
    }
    @RequestMapping("upAStu")
    public  String upAStu(int id, Model model){
        AStudent astudent = astudentService.loadAStuById(id);
        model.addAttribute("astudent",astudent);
        return "updataAStu";
    }
    @RequestMapping("updataAStu")
    public String updataAStu(AStudent astudent){
        int i = astudentService.updataAStu(astudent);
        return i>0?"redirect:Astuview":"error";
    }
}
