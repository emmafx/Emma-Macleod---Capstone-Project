package com.closingapp.closingsapp.controllers;

import com.closingapp.closingsapp.data.RealtorInfoRepository;
import com.closingapp.closingsapp.models.RealtorInformation;
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
public class RealtorInfoController {

    @Autowired
    private RealtorInfoRepository realtorInfoRepository;

    @GetMapping("createRealtorInfo")
    public String renderRealtorInfoForm(Model model) {
        model.addAttribute("title", "Add Realtor Information");
        model.addAttribute(new RealtorInformation());
        return "closing/createRealtorInfo";
    }

    @PostMapping("createRealtorInfo")
    public String processRealtorInfoForm(@Valid @ModelAttribute RealtorInformation realtorInformation, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Realtor Information");
            return "closing/createRealtorInfo";
        }
        realtorInfoRepository.save(realtorInformation);
        return "redirect:/closing/createFinancialInfo";
    }
}
