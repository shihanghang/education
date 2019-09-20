package com.edu.controller;

import com.edu.pojo.Quits;
import com.edu.service.PowersService;
import com.edu.service.QuitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/20 16:12
 * @Description:
 */
@Controller
public class QuitController {
    @Autowired
    private PowersService powersService;
    @Autowired
    private QuitService quitService;

    //离职申请
    @RequestMapping("quitview")
    public String quitView(Model model){
        List<Quits> quitList = quitService.findAllQuit();
        model.addAttribute("quitList",quitList);
        String poName="离职申请";
        String lz = powersService.findAdressByName(poName);
        return lz;
    }

    //添加离职申请
    @RequestMapping("savequit")
    public String saveQuit(Quits quit){
        int count = quitService.saveQuit(quit);
        return count>0?"redirect:quitview":"error";
    }

    //根据id查询对象的离职申请
    @RequestMapping("selectquitbyid")
    public String selectQuitById(int quId,Model model){
        Quits quits = quitService.selectQuitById(quId);
        model.addAttribute("quits",quits);
        return "updatequit";
    }

    //修改对象的离职申请
    @RequestMapping("updatequit")
    public String updateQuit(Quits quit){
        int count = quitService.updateQuit(quit);
        return count>0?"redirect:quitview":"error";
    }

    //删除选中对象的离职申请
    @RequestMapping("deletequit")
    public String deleteQuit(@RequestParam("ids") List<Integer> ids){
        int count = quitService.deleteQuit(ids);
        return count>0?"redirect:quitview":"error";
    }
}
