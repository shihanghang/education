package com.edu.controller;

import com.edu.pojo.Expenses;
import com.edu.service.ExpensesService;
import com.edu.service.PowersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/18 21:06
 * @Description:
 */
@Controller
public class ExpensesController {
    @Autowired
    private PowersService powersService;
    @Autowired
    private ExpensesService expensesService;

    //后勤报销
    @RequestMapping("expensesview")
    public String expensesView(Model model){
        List<Expenses> expensesList = expensesService.findAllExpenses();
        model.addAttribute("expensesList",expensesList);
        String poName="后勤报销";
        String hq=powersService.findAdressByName(poName);
        return hq;
    }

    //添加新的后勤报销信息
    @RequestMapping("saveexpenses")
    public String saveExpenses(Expenses expenses){
        int count = expensesService.saveExpenses(expenses);
        return count>0?"redirect:expensesview":"error";
    }

    //根据id查询对象的后勤报销信息
    @RequestMapping("selectexpensesbyid")
    public String selectExpensesById(int exId,Model model){
        Expenses expensess = expensesService.selectExpensesById(exId);
        model.addAttribute("expensess",expensess);
        return "updateexpenses";
    }

    //修改对象的后勤报销信息
    @RequestMapping("updateexpenses")
    public String updateExpenses(Expenses expenses){
        int count = expensesService.updateExpenses(expenses);
        return count>0?"redirect:expensesview":"error";
    }

    //删除选中对象的后勤报销信息
    @RequestMapping("deleteexpenses")
    public String deleteExpenses(@RequestParam("ids") List<Integer> ids){
        int count = expensesService.deleteExpenses(ids);
        return count>0?"redirect:expensesview":"error";
    }
}
