package com.cly.controller;

import com.cly.pojo.Emp;
import com.cly.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

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
        System.out.println("xxxxxxxxxxxxxxxxxxx");
        System.out.println("ilikeyou");

        System.out.println("张天龙");

        return "index";
    }
    @RequestMapping("/rrssssrrs")
    public String desmssos(){
        System.out.println("xxxxxxxxxxxxxxxxxxx");


        System.out.println("张天龙");

        return "index";
    }

    @RequestMapping("/rrsssssssrrs")
    public String desssmssos(){
        System.out.println("路上");


        System.out.println("张天龙");

        return "index";
    }
}
