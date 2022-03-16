package com.closingapp.closingsapp.controllers;

import com.closingapp.closingsapp.data.FinancialInfoRepository;
import com.closingapp.closingsapp.models.FinancialInformation;
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
public class FinancialInfoController {

    @Autowired
    private FinancialInfoRepository financialInfoRepository;

    @GetMapping("createFinancialInfo")
    public String renderFinancialInfoForm(Model model) {
        model.addAttribute("title", "Add Financial Information");
        model.addAttribute(new FinancialInformation());
        return "closing/createFinancialInfo";
    }

    @PostMapping("createFinancialInfo")
    public String processFinancialInfoForm(@Valid @ModelAttribute FinancialInformation financialInformation, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Financial Information");
            return "closing/createFinancialInfo";
        }
        financialInfoRepository.save(financialInformation);
        return "redirect:/closing/createPropertyInfo";
    }

}
