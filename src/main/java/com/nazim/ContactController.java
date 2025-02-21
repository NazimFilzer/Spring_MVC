package com.nazim;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @RequestMapping("contact")
    public String contact() {
            return "contact";
        }

// Here used RequestParams for accessing Variables and then we Used Model to send data to View
        @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String processform(@RequestParam("username") String username,
                              @RequestParam("password") String password, Model model) {

        model.addAttribute("username", username);
        model.addAttribute("password", password);
        return "success";

     }

}
