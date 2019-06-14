package com.liwinon.interviewform.controller;

import com.liwinon.interviewform.service.mainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/inform")
public class indexController {
    @Autowired
    mainService m;
    @GetMapping(value = "/index")
    public String index(){
        return "index";
    }

    @PostMapping(value = "/save")
    public String save(HttpServletRequest request){
        m.saveinfo(request);
        return null;
    }
}
