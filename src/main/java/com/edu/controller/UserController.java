package com.edu.controller;

import com.edu.pojo.Pay;
import com.edu.pojo.Powers;
import com.edu.pojo.Users;
import com.edu.service.*;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/11 18:09
 * @Description:
 */
@Controller
public class UserController {
    @Autowired
    private HttpSession session;
    @Autowired
    private UserService userService;
    @Autowired
    private R_P_Service r_p_service;
    @Autowired
    private U_R_Service u_r_service;
    @Autowired
    private PowersService powersService;


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String showLoginForm(){
        return "login";
    }
    @RequestMapping("Login2")
    public String loginshow(Users user, Model model){
        System.out.println(user+"fanhui");
        String userName=user.getUserName();
        String password=user.getPassword();
        session.setAttribute("user",user);
        if (userName.equals("") || password.equals("")){
            return "error";
        }
        try {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
            subject.login(token);
            if(subject.isAuthenticated()){
                return "redirect:qp";
            }
        }catch (AuthenticationException e){
            e.printStackTrace();
        }
        return "login";
    }
    @RequestMapping("qp")
    public  String outFind(Model model){
        Users user = (Users)session.getAttribute("user");
        String userName=user.getUserName();
        Users users=userService.findUserByName(userName);
        int userId=users.getUserId();
        int roleId=u_r_service.loadRidbyUid(userId);
        List<Integer> poId=r_p_service.loadPidByRid(roleId);
        List<Powers> power=powersService.loadPowerByPid(poId);
        model.addAttribute("power",power);
        return "main";
    }

    //用户退出时
    @RequestMapping("/logout")
    public String logout(){
        try {
            Subject subject = SecurityUtils.getSubject();
            //用户登录(清除用户在shiro中的驻留信息)
            subject.logout();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:login";
    }
    @RequestMapping("caozuo")
    public String caoZuo(String poName){
        //学生管理表单
        if (poName.equals("学生管理")){
            String stu=powersService.findAdressByName(poName);
            return stu;
        }
        //教师管理
        //教务管理
        //教师出勤
        //学生出勤
        //请假申请

        //离职申请
        if(poName.equals("离职申请")){
            return "redirect:quitview";
        }
        //薪资补助
        if(poName.equals("薪资补助")){
            return "redirect:payview";
        }
        //后勤报销
        if(poName.equals("后勤报销")){
            return "redirect:expensesview";
        }
        //人力申请
        if(poName.equals("人力申请")){
            return "redirect:manpowerview";
        }

        //成绩管理
        if (poName.equals("成绩管理")){
            return "redirect:performanceview";
        }
        //权限管理
        if (poName.equals("权限管理")){
            return "redirect:powersview";
        }
        return "error";
    }



}
