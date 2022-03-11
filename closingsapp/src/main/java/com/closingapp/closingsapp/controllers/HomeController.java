package com.closingapp.closingsapp.controllers;

import com.closingapp.closingsapp.models.Closing;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("")
    public String index() {
        return "index"; }

    //after login
    @GetMapping("home")
    public String displayAllOptions(Model model) {
        model.addAttribute("title", "Closing Dashboard");
        return "index";
    }
    @PostMapping("index")
    public String processCreateNewClosing(@ModelAttribute Model model ) {
        model.addAttribute("title", "Add Buyer Information");
        return "closing/createBuyerInfo";
    }
}
