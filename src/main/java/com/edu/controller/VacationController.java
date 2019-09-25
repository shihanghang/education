package com.edu.controller;

import com.edu.pojo.Vacation;
import com.edu.service.PowersService;
import com.edu.service.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/20 17:59
 * @Description:
 */
@Controller
public class VacationController {
    @Autowired
    private VacationService vacationService;
    @Autowired
    private PowersService powersService;
    @RequestMapping("vacview")
    public String vacView(Model model){
        String poName="请假申请";
        List<Vacation> vacations = vacationService.loadAllVac();
        System.out.println("vacations = " + vacations);
        model.addAttribute("vacations",vacations);
        String vac=powersService.findAdressByName(poName);
        return vac;
    }
    @RequestMapping("addvac")
    public String addAStu(Vacation vacation){
        int count= vacationService.addVac(vacation);
        return count>0?"redirect:vacview":"error";
    }
    @RequestMapping("deletevac")
    public String deleteVac(int id){
        int i = vacationService.deleVac(id);
        return i>0?"redirect:vacview":"error";
    }
    @RequestMapping("upvac")
    public  String upVac(int id, Model model){
        Vacation vacation = vacationService.loadVacById(id);
        model.addAttribute("vacation",vacation);
        return "updateVac";
    }
    @RequestMapping("updateVac")
    public String updateVac(Vacation vacation){
        int i = vacationService.updataVac(vacation);
        return i>0?"redirect:vacview":"error";
    }
}
