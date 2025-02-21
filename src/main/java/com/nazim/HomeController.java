package com.nazim;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

// Request mapping to class
//@RequestMapping("/app")
public class HomeController {

    @RequestMapping(path="home", method = RequestMethod.GET)
    public String home() {
        System.out.println("Home Page");
        return "home";
    }

    @RequestMapping("/about")
    public String about() {
        System.out.println("About Page");
        return "about";
    }

//    Sending Dynamic Data to view using ModelandView
    @RequestMapping("/help")
    public ModelAndView help() {

        ModelAndView mv = new ModelAndView();
        mv.addObject("name","Nazim");
        mv.setViewName("help");

        return mv;
    }
}
