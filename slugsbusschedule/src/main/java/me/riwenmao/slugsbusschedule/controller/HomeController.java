package me.riwenmao.slugsbusschedule.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    String appName;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("appName", appName);
        return "index";
    }
}