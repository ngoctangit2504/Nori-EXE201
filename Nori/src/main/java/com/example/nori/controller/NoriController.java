package com.example.nori.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class NoriController {

    @GetMapping("/")
    public ModelAndView showHome() {
        return new ModelAndView("/home");
    }

}
