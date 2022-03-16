package com.closingapp.closingsapp.controllers;

import com.closingapp.closingsapp.data.SellersInfoRepository;
import com.closingapp.closingsapp.models.SellersInformation;
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
public class SellerInfoController {

    @Autowired
    private SellersInfoRepository sellersInfoRepository;

    @GetMapping("createSellerInfo")
    public String renderSellerInfoForm (Model model) {
        model.addAttribute("title", "Add Seller Information");
        model.addAttribute(new SellersInformation());
        return "closing/createSellerInfo";
    }

    @PostMapping("createSellerInfo")
    public String processSellerInfoForm (@Valid @ModelAttribute SellersInformation sellersInformation, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Seller Information");
            return "closing/createSellerInfo";
        }
        sellersInfoRepository.save(sellersInformation);
        return "redirect:/closing/createRealtorInfo";
    }
}
