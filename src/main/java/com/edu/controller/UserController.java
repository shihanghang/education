package com.edu.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/11 18:09
 * @Description:
 */
@Controller
public class UserController {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String showLoginForm(){
        return "login";
    }
    @RequestMapping("Login2")
    public String loginshow(@RequestParam("userName") String userName,
                            @RequestParam("password") String password){
        try {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
            subject.login(token);
            if(subject.isAuthenticated()){
                System.out.println("登陆成功");
                return "main";
            }
        }catch (AuthenticationException e){
            e.printStackTrace();
        }
        return "login";
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
}
