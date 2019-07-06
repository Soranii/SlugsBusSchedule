package me.riwenmao.slugsbusschedule;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Hahahahahaha");
        return "home.html";
    }
}