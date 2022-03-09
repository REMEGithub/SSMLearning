package com.xia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @GetMapping("/t1")
    public String testRecieve(@RequestParam("name") String name, Model model){
        System.out.println(name);
        model.addAttribute("msg","the name is:"+name);
        return "test";
    }
}
