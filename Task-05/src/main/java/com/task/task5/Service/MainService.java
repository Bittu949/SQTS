package com.task.task5.Service;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainService {
    public String create(String name, int initialBalance, HttpSession session){
        session.setAttribute("name", name);
        session.setAttribute("initialBalance", initialBalance);
        session.setAttribute("balance", initialBalance);
        session.setAttribute("transactions", new ArrayList<String>());
        return "Account created successfully !";
    }
    public String withdraw(int amount, HttpSession session){
        int balence = (int) session.getAttribute("balance");
        List<String> transactions = (ArrayList<String>) session.getAttribute("transactions");
        if(balence - amount >= 3000){
            session.setAttribute("balance", balence - amount);
            transactions.add(amount+" Withdrawn");
            session.setAttribute("transactions", transactions);
            return "Transaction Completed !";
        }else{
            return "Insufficient Balence !";
        }
    }
    public String deposit(int amount, HttpSession session){
        int balance = (int) session.getAttribute("balance");
        List<String> transactions = (ArrayList<String>) session.getAttribute("transactions");
        session.setAttribute("balance", balance + amount);
        transactions.add(amount+" Deposited");
        session.setAttribute("transactions", transactions);
        return "Transaction Completed !";
    }
    public int getBalance(HttpSession session){
        return (int) session.getAttribute("balance");
    }
}
