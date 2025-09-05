package com.prisma77.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/home"})
    public String home(Model model){
        model.addAttribute("msg", "Spring Legacy (XML) running!");
        return "home"; // /WEB-INF/views/home.jsp
    }


    @GetMapping("/message")
    public String message(Model model){
        model.addAttribute("msg", "스프링");
        return "show";
    }
}