package com.xia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFulController {
    /*@RequestMapping("/add/{a}/{b}")
    public String RestFulTest(@PathVariable int a,@PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg","RestFulTest1:"+res);
        return "test";
    }*/
    @GetMapping("/add/{a}/{b}")
    public String RestFulTest2(@PathVariable int a,@PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg","RestFulTest1:"+res);
        return "test";
    }
    @PostMapping("/add/{a}/{b}")
    public String RestFulTest3(@PathVariable int a,@PathVariable int b, Model model){
        int res=a*b;
        model.addAttribute("msg","RestFulTest1:"+res);
        return "test";
    }
}
