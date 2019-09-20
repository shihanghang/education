package com.edu.controller;

import com.edu.pojo.Powers;
import com.edu.service.PowersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/20 10:02
 * @Description:
 */
@Controller
public class PowersController {
    @Autowired
    private PowersService powersService;

    //权限管理
    @RequestMapping("powersview")
    public String powersView(Model model){
        List<Powers> powersList = powersService.findAllPowers();
        model.addAttribute("powersList",powersList);
        String poName="权限管理";
        String qx = powersService.findAdressByName(poName);
        return qx;
    }

    //添加新的权限信息
    @RequestMapping("savepowers")
    public String savePowers(Powers powers){
        int count = powersService.savePowers(powers);
        return count>0?"redirect:powersview":"error";
    }

    //根据id查询对应的权限信息
    @RequestMapping("selectpowersbyid")
    public String selectPowersById(int poId,Model model){
        Powers powers = powersService.selectPowersById(poId);
        model.addAttribute("powers",powers);
        return "updatepowers";
    }

    //修改对象的权限信息
    @RequestMapping("updatepowers")
    public String updatePowers(Powers powers){
        int count = powersService.updatePowers(powers);
        return count>0?"redirect:powersview":"error";
    }

    //删除所选对象的权限信息
    @RequestMapping("deletepowers")
    public String deletePowers(@RequestParam("ids") List<Integer> ids){
        int count = powersService.deletePowers(ids);
        return count>0?"redirect:powersview":"error";
    }}
