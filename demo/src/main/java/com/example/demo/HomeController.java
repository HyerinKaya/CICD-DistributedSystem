package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value = "/home", method= RequestMethod.GET)
    public String goHome(HttpServletRequest request) {
        return "/home";
    }
}
