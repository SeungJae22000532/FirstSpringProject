package com.mycompany.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {
        System.out.println("home ~~");
        model.addAttribute("serverTime", new java.util.Date());
        return "index";
    }
}
