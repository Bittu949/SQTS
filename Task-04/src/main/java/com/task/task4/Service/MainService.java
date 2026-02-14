package com.task.task4.Service;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MainService {
    Random random;
    private Map<String, Integer> leaderboard;
    public MainService(){
        random = new Random();
        leaderboard = new HashMap<>();
    }
    public void generateNumber(String playerName, HttpSession session){
        int randomNum = random.nextInt(101);
        session.setAttribute("playerName", playerName);
        session.setAttribute("randomNumber", randomNum);
        session.setAttribute("attemptCount", 0);
        session.setAttribute("guessedHistory", new ArrayList<Integer>());
        Object obj = session.getAttribute("pastGameAttempts");
        if(obj == null) {
            session.setAttribute("pastGameAttempts", new ArrayList<Integer>());
            session.setAttribute("allGuessHistories", new ArrayList<ArrayList<Integer>>());
        }
    }
    public String checkGuess(String playerName, int guess, HttpSession session){
        int attempt = (int) session.getAttribute("attemptCount");
        int randomNumber = (int) session.getAttribute("randomNumber");
        List<Integer> guessedHistory = (ArrayList<Integer>) session.getAttribute("guessedHistory");
        if(guess >= 0 && guess <= 100) {
            if (randomNumber == guess) {
                session.setAttribute("attemptCount", ++attempt);
                guessedHistory.add(guess);
                session.setAttribute("guessedHistory", guessedHistory);
                List<List<Integer>> allGuesses = (List<List<Integer>>) session.getAttribute("allGuessHistories");
                allGuesses.add(new ArrayList<>(guessedHistory));
                session.setAttribute("allGuessHistories", allGuesses);
                ArrayList<Integer> pastGameAttempts = (ArrayList<Integer>)session.getAttribute("pastGameAttempts");
                pastGameAttempts.add((int) session.getAttribute("attemptCount"));
                session.setAttribute("pastGameAttempts", pastGameAttempts);
                if(!leaderboard.containsKey(playerName)){
                    leaderboard.put(playerName,attempt);
                }else {
                    if(attempt < leaderboard.get(playerName)){
                        leaderboard.put(playerName, attempt);
                    }
                }

                return "Correct! You guessed the number!";
            } else if (randomNumber < guess) {
                session.setAttribute("attemptCount", ++attempt);
                guessedHistory.add(guess);
                session.setAttribute("guessedHistory", guessedHistory);
                if (guess - randomNumber <= 5)
                    return "Very close! You’re almost there.";
                else
                    return "Too high! Try a smaller number.";
            } else {
                session.setAttribute("attemptCount", ++attempt);
                guessedHistory.add(guess);
                session.setAttribute("guessedHistory", guessedHistory);
                if (randomNumber - guess <= 5)
                    return "Very close! You’re almost there.";
                else
                    return "Too low! Try a bigger number.";
            }
        }else{
           return "Please enter a valid number.";
        }
    }
    public Map<String, Integer> getLeaderboard(){
        return leaderboard;
    }
}
