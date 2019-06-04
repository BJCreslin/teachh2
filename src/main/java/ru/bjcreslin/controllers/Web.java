package ru.bjcreslin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.bjcreslin.service.F1ServiceImpl;
import ru.bjcreslin.service.F2Service;
import ru.bjcreslin.service.F3Service;

@Controller
@RequestMapping("/index")

public class Web {
    private F1ServiceImpl f1Service;
    private F2Service f2Service;
    private F3Service f3Service;

    public Web(F1ServiceImpl f1Service, F2Service f2Service, F3Service f3Service) {
        this.f1Service = f1Service;
        this.f2Service = f2Service;
        this.f3Service = f3Service;
    }

    @GetMapping("")
    public String get(Model model) {


        model.addAttribute("f1all", f1Service.findAll());
        model.addAttribute("f2all", f2Service.findAll());
        model.addAttribute("f3all", f3Service.findAll());
        return "index";
    }
}
