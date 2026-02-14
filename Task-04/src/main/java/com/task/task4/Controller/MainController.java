package com.task.task4.Controller;

import com.task.task4.Service.MainService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

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
    @PostMapping("/start")
    public String startGame(@RequestParam String playerName,
                            HttpSession session,
                            Model model){
        model.addAttribute("playerName", playerName);
        mainService.generateNumber(playerName, session);
        return "index";
    }
    @PostMapping("/guess")
    public String guessNumber(@RequestParam String playerName,
                              @RequestParam int guess,
                              HttpSession session,
                              Model model){
        String message = mainService.checkGuess(playerName, guess, session);
        model.addAttribute("playerName", playerName);
        model.addAttribute("message", message);
        model.addAttribute("attempts", (int) session.getAttribute("attemptCount"));
        model.addAttribute("guessHistory", (ArrayList<Integer>) session.getAttribute("guessedHistory"));
        model.addAttribute("allGuessHistories", (ArrayList<ArrayList<Integer>>) session.getAttribute("allGuessHistories"));
        model.addAttribute("leaderboard", mainService.getLeaderboard());
        model.addAttribute("pastGameAttempts", (ArrayList<Integer>) session.getAttribute("pastGameAttempts"));
        return "index";
    }
    @PostMapping("/reset")
    public String resetGame(HttpSession session){
        mainService.generateNumber((String) session.getAttribute("playerName"), session);
        return "index";
    }
}
