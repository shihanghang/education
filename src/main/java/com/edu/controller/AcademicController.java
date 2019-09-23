package com.edu.controller;

import com.edu.pojo.Academic;
import com.edu.pojo.Student;
import com.edu.service.AcademicService;
import com.edu.service.PowersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/19 16:39
 * @Description:
 */
@Controller
public class AcademicController {
    @Autowired
    private AcademicService academicService;
    @Autowired
    private PowersService powersService;
    @RequestMapping("acaview")
    public String acaview(Model model){
        String poName="教务管理";
        List<Academic> academics = academicService.laodAllAcademic();
        model.addAttribute("academics",academics);
        String aca=powersService.findAdressByName(poName);
        return aca;
    }
    @RequestMapping("addAca")
    public String addAca(Academic academic){
        int count= academicService.addAcademic(academic);
        return count>0?"redirect:acaview":"error";
    }
    @RequestMapping("deleteAca")
    public String deleteAca(int id){
        int i = academicService.deleAca(id);
        return i>0?"redirect:acaview":"error";
    }
    @RequestMapping("upAca")
    public  String upAca(int id, Model model){
        Academic academic = academicService.loadAcaById(id);
        model.addAttribute("academic",academic);
        System.out.println(academic+"教务");
        return "updateAca";
    }
    @RequestMapping("updateAca")
    public String updateAca(Academic academic){
        int i = academicService.updataAca(academic);
        return i>0?"redirect:acaview":"error";
    }
}
