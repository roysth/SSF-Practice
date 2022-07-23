package com.assignment.assignment01.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignment.assignment01.Model.Contact;

@Controller
@RequestMapping (path = "/shoppingcart")
public class assignmentController {
    

    @GetMapping
    public String showEcommercepage (Model model) {
        model.addAttribute("cartinput", new Contact());
        return "ecommerce";
    }

    //to reflect the shopping cart list on the web page
    @PostMapping
    public String saveKart (Model model) {

        return null;
    }
        

    
}
