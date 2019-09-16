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
    @RequestMapping("index")
    public String index(){
        return "index";
    }
}

