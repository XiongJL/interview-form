package com.liwinon.interviewform.controller;

import com.liwinon.interviewform.service.mainService;
import com.liwinon.interviewform.util.WordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

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
    @ResponseBody
    public String save(HttpServletRequest request){
        Map<String,String>data =  m.saveinfo(request);
        String path0 =  data.get("iname0");
        String path1 = data.get("phone0");
        String path="\\\\172.60.6.66\\7天自动删除\\app\\"+path0+path1+".doc"; //要写入的地址
        WordUtil.writeFile(path,WordUtil.redFileContent("D:\\DOCS\\入职登记表（A3版）修改版本.xml",data));
        return null;
    }
}
