package me.riwenmao.slugsbusschedule.Home;
import me.riwenmao.slugsbusschedule.BusCard.BusCard;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.ModelAndView;
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

    //show all buslines available
    @RequestMapping("/BusCard")
    public String busLines(Model model){
        //model.addAttribute("cards", BusCard.getAll());
        return "BusCard";
    }

    @RequestMapping(value="/save", method=RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute BusCard busCard){  
        ModelAndView modelAndView = new ModelAndView();  
        modelAndView.setViewName("BusCard");      
        modelAndView.addObject("busCard", busCard);    
        return modelAndView;      
    }   
}