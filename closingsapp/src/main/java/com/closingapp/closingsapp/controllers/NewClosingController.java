package com.closingapp.closingsapp.controllers;

import com.closingapp.closingsapp.data.BuyersInfoRepository;
import com.closingapp.closingsapp.models.BuyersInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("closing")
public class NewClosingController {

    @Autowired
    private BuyersInfoRepository buyersInfoRepository;

    @GetMapping("/createBuyerInfo")
    public String displayNewClosingForm(Model model) {
    model.addAttribute("buyerInfo", buyersInfoRepository.findAll());
        return "closing/createBuyerInfo";
    }

}
