package com.closingapp.closingsapp.controllers;

import com.closingapp.closingsapp.data.PropertyInfoRepository;
import com.closingapp.closingsapp.models.PropertyInformation;
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
public class PropertyInfoController {

    @Autowired
    PropertyInfoRepository propertyInfoRepository;

    @GetMapping("createPropertyInfo")
    public String renderPropertyInfoForm(Model model) {
        model.addAttribute("title", "Add Property Information");
        model.addAttribute(new PropertyInformation());
        return "closing/createPropertyInfo";
    }

    @PostMapping("createPropertyInfo")
    public String processRealtorInfoForm(@Valid @ModelAttribute PropertyInformation propertyInformation, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Property Information");
            return "closing/createPropertyInfo";
        }
        propertyInfoRepository.save(propertyInformation);
        return "redirect:/closing/index";
    }

}
