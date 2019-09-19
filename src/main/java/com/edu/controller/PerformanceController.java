package com.edu.controller;

import com.edu.pojo.Performance;
import com.edu.service.PerformanceService;
import com.edu.service.PowersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/19 16:05
 * @Description:
 */
@Controller
public class PerformanceController {
    @Autowired
    private PowersService powersService;
    @Autowired
    private PerformanceService performanceService;

    //成绩管理
    @RequestMapping("performanceview")
    public String performanceView(Model model){
        List<Performance> performanceList = performanceService.findAllPerformance();
        model.addAttribute("performanceList",performanceList);
        String poName="成绩管理";
        String cj = powersService.findAdressByName(poName);
        return cj;
    }

    //添加学生成绩
    @RequestMapping("saveperformance")
    public String savePerformance(Performance performance){
        int count = performanceService.savePerformance(performance);
        return count>0?"redirect:performanceview":"error";
    }

    //根据id查询学生的成绩
    @RequestMapping("selectperformancebyid")
    public String selectPerformanceById(int peId,Model model){
        Performance performances = performanceService.selectPerformanceById(peId);
        model.addAttribute("performances",performances);
        return "updateperformance";
    }

    //修改学生成绩
    @RequestMapping("updateperformance")
    public String updatePerformance(Performance performance){
        int count = performanceService.updatePerformance(performance);
        return count>0?"redirect:performanceview":"error";
    }

    //删除所选学生的成绩
    @RequestMapping("deleteperformance")
    public String deletePerformance(@RequestParam("ids") List<Integer> ids){
        int count = performanceService.deletePerformance(ids);
        return count>0?"redirect:performanceview":"error";
    }
}
