package com.task.task3.Service;

import org.springframework.stereotype.Service;

@Service
public class MainService {
    public Object calculate(int num1, int num2, String operation){
        switch (operation){
            case "add":
                return num1 + num2;
            case "sub":
                return num1 - num2;
            case "mul":
                return num1 * num2;
            case "div":
                if(num2 != 0)
                    return (double) num1 / num2;
                return "Cannot divide by 0";
            case "percent":
                if(num2 == 0)
                    return "Cannot divide by zero";
                return ((double) num1 / num2) * 100;
            default:
                return "Please enter valid operation";
        }
    }
}
