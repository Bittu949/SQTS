package com.task.task3.Controller;

import com.task.task3.Service.MainService;
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
    @PostMapping("/calculate")
    public String calculate(@RequestParam int num1,
                          @RequestParam int num2,
                          @RequestParam String operation,
                          Model model){
        Object result = mainService.calculate(num1, num2, operation);
        model.addAttribute("result", result);
        return "index";
    }
}
