package com.task.task5.Controller;

import com.task.task5.Service.MainService;
import jakarta.servlet.http.HttpSession;
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
    @PostMapping("/create")
    public String createAccount(@RequestParam String name,
                                @RequestParam int initialBalance,
                                Model model,
                                HttpSession session){
        String message = mainService.create(name, initialBalance, session);
        model.addAttribute("accountName", name);
        model.addAttribute("balance", session.getAttribute("balance"));
        model.addAttribute("createMsg", message);
        return "index";
    }
    @PostMapping("/deposit")
    public String depositMoney(@RequestParam int amount,
                               HttpSession session,
                               Model model){
        model.addAttribute("accountName", session.getAttribute("name"));
        model.addAttribute("message", mainService.deposit(amount, session));
        model.addAttribute("balance", mainService.getBalance(session));
        model.addAttribute("transactions", session.getAttribute("transactions"));
        return "index";
    }
    @PostMapping("/withdraw")
    public String withdrawMoney(@RequestParam int amount,
                                HttpSession session,
                                Model model){
        model.addAttribute("accountName", session.getAttribute("name"));
        model.addAttribute("message", mainService.withdraw(amount, session));
        model.addAttribute("balance", mainService.getBalance(session));
        model.addAttribute("transactions", session.getAttribute("transactions"));
        return "index";
    }
}
