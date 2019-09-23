package com.edu.controller;

import com.alibaba.fastjson.JSONArray;
import com.edu.pojo.Powers;
import com.edu.pojo.Urp;
import com.edu.pojo.Users;
import com.edu.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

/**
 * @Author: ZzuI
 * @Date: 2019/9/20 10:02
 * @Description:
 */
@Controller
public class PowersController {
    @Autowired
    private PowersService powersService;
    @Autowired
    private UserService userService;
    @Autowired
    private U_R_Service u_r_service;
    @Autowired
    private RoleService roleService;
    @Autowired
    private R_P_Service r_p_service;

    //权限管理
    @RequestMapping("powersview")
    public String powersView(Model model){
        List<Users> allUsers = userService.findAllUsers();
        List<String> op=new ArrayList<>();
        List<Urp> mm=new ArrayList<>();
        for(Users us:allUsers){
            Urp urp = new Urp();
            int id = us.getUserId();
            int rid = u_r_service.loadRidbyUid(id);
            String rnames = roleService.loadRoleNameById(rid);
            List<Integer> pids = r_p_service.loadPidByRid(rid);
            op=powersService.loadPnameByPid(pids);
            Map<String,List<String>> map2=new TreeMap<>();
            //map2.put(rnames,op);
            //map1.put(us.getUserName(),map2);
            String uuname=us.getUserName();
            urp.setuName(uuname);
            urp.setrName(rnames);
            urp.setpName(op);
            mm.add(urp);
           /* for (Integer p:pids){
                String poName = powersService.findNameById(p);

                Map<String,String> map2=new TreeMap<>();
                map2.put(rnames,poName);
                map1.put(us,map2);
                model.addAttribute("map1",map1);
                System.out.println(map1);
            }*/
        }
        /*Object o = JSONArray.toJSON(map1);
        System.out.println(map1+"quxianjihe");*/
        Object mmm= JSONArray.toJSON(mm);

        System.out.println(mmm);
        model.addAttribute("mmm",mmm);
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
    }
}
