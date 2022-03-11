package com.closingapp.closingsapp.controllers;

import com.closingapp.closingsapp.data.BuyersInfoRepository;
import com.closingapp.closingsapp.models.BuyersInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("closing")
public class BuyerInfoController {

    @Autowired
    private BuyersInfoRepository buyersInfoRepository;

    @GetMapping("buyerInfo")
    public String renderBuyerInfoForm (Model model) {
        model.addAttribute("title", "Add Buyer Information");
        model.addAttribute(new BuyersInformation());
        return "closing/createBuyerInfo";
    }

    @PostMapping("buyerInfo")
    public String processBuyerInfoForm (@Valid @ModelAttribute BuyersInformation buyersInformation, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Buyer Information");
            return "closing/createBuyerInfo";
        }
        buyersInfoRepository.save(buyersInformation);
        return "redirect:/closing/createSellerInfo";
    }
}
