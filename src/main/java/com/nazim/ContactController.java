package com.nazim;

import com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    // Method2 for ModelAttribute (Using Common objects between Pages)
    @ModelAttribute
    public void commonDataForModel (Model model) {
        model.addAttribute("title","Code with Nazim");
        model.addAttribute("desc","Heaven for Coders");
        System.out.println("Common Data for Model, happens before activating endpoint");
    }

    @RequestMapping("contact")
    public String contact(Model model) {
            return "contact";
        }

    // Using ModelAttribute Method 1
    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String processform(@ModelAttribute User user, Model model ) {
        // here ModelAttribute connects the parametrs according to there name mapping
        System.out.println(user);
        return "success" ;

    }
    // Using ModelAttribute Method 1
//    @RequestMapping(path = "/processform", method = RequestMethod.POST)
//    public String processform(@ModelAttribute User user, Model model ) {
//        // here ModelAttribute connects the parametrs according to there name mapping
//        System.out.println(user);
//        return "success";
//
//    }
// Here used RequestParams for accessing Variables and then we Used Model to send data to View
//    @RequestMapping(path = "/processform", method = RequestMethod.POST)
//    public String processform(@RequestParam("username") String username,
//                              @RequestParam("password") String password, Model model) {
//
//        model.addAttribute("username", username);
//        model.addAttribute("password", password);
//        return "success";
//
//     }

}
