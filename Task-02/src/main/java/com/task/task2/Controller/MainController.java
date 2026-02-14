package com.task.task2.Controller;

import com.task.task2.Entity.Student;
import com.task.task2.Service.MainService;
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
    @PostMapping("/students")
    public String getStudent(@RequestParam String name,
                             @RequestParam Integer roll,
                             @RequestParam String className,
                             @RequestParam Integer m1,
                             @RequestParam Integer m2,
                             @RequestParam Integer m3,
                             @RequestParam Integer m4,
                             @RequestParam Integer m5,
                             Model model){
        Student student = mainService.addStudent(name, roll, className, m1, m2,m3, m4, m5);
        model.addAttribute("lastStudent", student);
        model.addAttribute("top3", mainService.getTop3());
        model.addAttribute("students", mainService.getStudents());
        return "index";
    }
}
