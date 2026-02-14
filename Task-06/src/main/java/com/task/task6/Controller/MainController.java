package com.task.task6.Controller;

import com.task.task6.Service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/students")
public class MainController {
    MainService mainService;
    public MainController(MainService mainService){
        this.mainService = mainService;
    }
    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("students", mainService.displayStudents());
        return "index";
    }
    @PostMapping("/add")
    public String add(@RequestParam String studentId,
                      @RequestParam String name,
                      @RequestParam String email,
                      @RequestParam String course,
                      @RequestParam int marks,
                      Model model){
        String message = mainService.addStudent(studentId, name, email, course, marks);
        model.addAttribute("message", message);
        model.addAttribute("students", mainService.displayStudents());
        return "index";
    }
    @PostMapping("/delete")
    public String delete(@RequestParam String studentId, Model model){
        model.addAttribute("message", mainService.deleteStudent(studentId));
        model.addAttribute("students", mainService.displayStudents());
        return "index";
    }
    @PostMapping("/update")
    public String update(@RequestParam String studentId,
                         @RequestParam(required = false) String name,
                         @RequestParam(required = false) String email,
                         @RequestParam(required = false) String course,
                         @RequestParam(required = false) Integer marks,
                         Model model){
        model.addAttribute("message", mainService.updateStudent(studentId, name, email, course, marks));
        model.addAttribute("students", mainService.displayStudents());
        return "index";
    }
}
