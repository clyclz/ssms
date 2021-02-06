package com.cly.controller;

import com.cly.pojo.Emp;
import com.cly.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping("/show")
    public String show() throws IOException {
        List<Emp> lis=empService.getAll();
        for(Emp r:lis){
            System.out.println(r);
        }
        return "index";
    }

    @RequestMapping("/shows")
    public String demos(){

        System.out.println("张天龙");

        System.out.println("张龙是一个好人");
        System.out.println("xxxxxxxxxxxxx");
        return "index";
    }

    @RequestMapping("/sb")
    public String ssr(Date date, Model m){
        m.addAttribute("date",date);
        return "index";
    }
    @RequestMapping("/login")
    public String login(@RequestParam(value="locale",defaultValue = "false") Locale locale){
        return "login";
    }
    @RequestMapping("/logins")
    public String logings(Emp emp,Model model){
        //int i=1/0;
        Emp e=empService.getByIdAndName(emp);
        if(e!=null){
            model.addAttribute("user",emp);
            return "index";
        }else{
            return "redirect:/login";
        }

    }

}
