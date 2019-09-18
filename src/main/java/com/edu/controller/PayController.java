package com.edu.controller;

import com.edu.pojo.Pay;
import com.edu.service.PayService;
import com.edu.service.PowersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/18 14:47
 * @Description:
 */
@Controller
public class PayController {
    @Autowired
    private PowersService powersService;
    @Autowired
    private PayService payService;

    //薪资补助
    @RequestMapping("payview")
    public String payview(Model model){
        List<Pay> payList = payService.findAllPay();
        model.addAttribute("payList",payList);
        String poName="薪资补助";
        String xz=powersService.findAdressByName(poName);
        return xz;
    }
    //添加薪资补助
    @RequestMapping("savepay")
    public String savePay(Pay pay){
        int count = payService.savePay(pay);
        return count>0?"redirect:payview":"error";
    }

    //根据I的查询pay对象
    @RequestMapping("selectpaybyid")
    public String selectPayById(int paId,Model model){
        Pay pays = payService.selectPayById(paId);
        model.addAttribute("pays",pays);
        return "updatepay";
    }


    //修改人员薪资
    @RequestMapping("updatepay")
    public  String updatePay(Pay pay){
        int count = payService.updatePay(pay);
        return count>0?"redirect:payview":"error";
    }

    //删除人员薪资
    @ResponseBody
    @RequestMapping("deletepay")
    public String deletePay(@RequestParam("ids") List<Integer> ids){
        int count = payService.deletePay(ids);
        return count>0?"ojbk":"wrong";
    }
}
