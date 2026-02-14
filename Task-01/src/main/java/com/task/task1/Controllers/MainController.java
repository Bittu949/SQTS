package com.task.task1.Controllers;

import com.task.task1.Service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    MainService mainService;
    public MainController(MainService mainService){
        this.mainService = mainService;
    }
    @GetMapping("/")
    public String homePage(){
        return "index";
    }
    @PostMapping("/solve")
    public String calculation(Model model,
                              @RequestParam Integer number,
                              @RequestParam String operation){
        Object answer = mainService.compute(number, operation);
        model.addAttribute("result", answer);
        return "index";
    }
}
