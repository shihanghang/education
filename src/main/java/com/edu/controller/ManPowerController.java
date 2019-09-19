package com.edu.controller;

import com.edu.pojo.Manpower;
import com.edu.service.ManPowerService;
import com.edu.service.PowersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/19 10:02
 * @Description:
 */
@Controller
public class ManPowerController {
    @Autowired
    private PowersService powersService;
    @Autowired
    private ManPowerService manPowerService;

    //人力申请
    @RequestMapping("manpowerview")
    public String manPowerView(Model model){
        List<Manpower> manpowerList = manPowerService.findAllManPower();
        model.addAttribute("manpowerList",manpowerList);
        String poName="人力申请";
        String rl = powersService.findAdressByName(poName);
        return rl;
    }

    //添加新的人力申请
    @RequestMapping("savemanpower")
    public String saveManPower(Manpower manpower){
        int count = manPowerService.saveManPower(manpower);
        return count>0?"redirect:manpowerview":"error";
    }

    //根据对象id查询对应的人力申请
    @RequestMapping("selectmanpowerbyid")
    public String selectManPowerById(int maId,Model model){
        Manpower manpowers = manPowerService.selectManPowerById(maId);
        model.addAttribute("manpowers",manpowers);
        return "updatemanpower";
    }

    //修改对象的人力申请
    @RequestMapping("updatemanpower")
    public String updateManPower(Manpower manpower){
        int count = manPowerService.updateManPower(manpower);
        return count>0?"redirect:manpowerview":"error";
    }

    //删除选中对象的人力申请
    @RequestMapping("deletemanpower")
    public String deleteManPower(@RequestParam("ids") List<Integer> ids){
        int count = manPowerService.deleteManPower(ids);
        return count>0?"redirect:manpowerview":"error";
    }
}
