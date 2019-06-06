package ru.bjcreslin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.bjcreslin.models.F1;
import ru.bjcreslin.models.F2;
import ru.bjcreslin.models.F3;
import ru.bjcreslin.service.F1ServiceImpl;
import ru.bjcreslin.service.F2ServiceImpl;
import ru.bjcreslin.service.F3ServiceImpl;

@Controller
@RequestMapping("/index")

public class Web {
    private F1ServiceImpl f1Service;
    private F2ServiceImpl f2Service;
    private F3ServiceImpl f3Service;

    public Web(F1ServiceImpl f1Service, F2ServiceImpl f2Service, F3ServiceImpl f3Service) {
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

    @GetMapping("/delete1F1")

    public String delete1F1(Model model) {
          f1Service.deleteByCode(1L);

        return "redirect:/index";
    }

    @GetMapping("fill")

    public String fill(Model model) {
        for (int i = 0; i < 5; i++) {
            F1 f1 = new F1();
            f1.setName(Integer.toString(i));
            f1Service.save(f1);
            for (int j = 0; j < 3; j++) {

                F2 f2 = new F2();
                f2.setName(Integer.toString(i * 100 + j));
                f2Service.save(f2);
                f1.addF2(f2);
                f2.setF1(f1);
            }
            F3 f3 = new F3();
            f3.setName(Integer.toString(i));
            f3Service.save(f3);
        }
        f1Service.flush();
        f2Service.flush();
        f3Service.flush();
        return "redirect:/index";
    }
}
