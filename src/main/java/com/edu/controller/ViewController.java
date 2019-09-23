package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/11 18:10
 * @Description:
 */
@Controller
public class ViewController {
    @RequestMapping("opop")
    public String opop(){
        return "login";
    }
    @RequestMapping("welcomeview")
    public String welcomeview(){
        return "welcome";
    }
    @RequestMapping("savepayview")
    public String savePayView(){
        return "savepay";
    }
    @RequestMapping("saveexpensesview")
    public String saveExpensesView(){
        return "saveexpenses";
    }
    @RequestMapping("savemanpowerview")
    public String saveManPowerView(){
        return "savemanpower";
    }
    @RequestMapping("saveperformanceview")
    public String savePerformanceView(){
        return "saveperformance";
    }
    @RequestMapping("savepowersview")
    public String savePowersView(){
        return "savepowers";
    }
    @RequestMapping("savequitview")
    public String saveQuitView(){
        return "savequit";
    }
    @RequestMapping("addStuview")
    public String addStuview(){
        return "addStu";
    }
    @RequestMapping("addTeaview")
    public String addTeaview(){
        return "addTea";
    }
    @RequestMapping("addAcaview")
    public String addAcaview(){
        return "addAca";
    }
    @RequestMapping("addAttview")
    public String addAttview(){
        return "addAtt";
    }
    @RequestMapping("addAStuview")
    public String addAStuview(){
        return "addAStu";
    }
    @RequestMapping("addVacview")
    public String addVacview(){
        return "addVac";
    }
}
