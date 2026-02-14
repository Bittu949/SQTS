package com.task.task1.Service;

import org.springframework.stereotype.Service;

@Service
public class MainService {
    public String compute(Integer number, String operation){
        if (number == null || operation == null) {
            return "Invalid input";
        }

        return switch (operation) {
            case "evenOdd" -> checkEvenOdd(number);
            case "prime" -> checkPrime(number);
            case "fibonacci" -> findFibonacci(number);
            case "palindrome" -> checkPalindrome(number);
            default -> "Invalid operation";
        };
    }
    public String checkEvenOdd(Integer number){
        if(number%2==0)
            return number+" is Even";
        return number+" is Odd";
    }
    public String checkPrime(Integer number){
        if(number<2)
            return number+" is Not Prime";
        for(int i=2; i*i<=number; i++){
            if(number%i==0)
                return number+" is Not Prime";
        }
        return number+" is Prime";
    }
    public String findFibonacci(Integer number){
        if(number<=0)
            return "Please enter valid number !";

        int num1 = 0;
        int num2 = 1;
        StringBuilder sb = new StringBuilder("Fibonacci series for " + number + " terms: ");

        for(int i=0; i<number; i++){
            sb.append(num1).append(" ");
            int temp = num1;
            num1 = num2;
            num2 = temp + num1;
        }
        return sb.toString().trim();
    }
    public String checkPalindrome(Integer number){
        if(number<0)
            return number+" is Not Palindrome";
        String str = String.valueOf(number);
        int start = 0;
        int end = str.length()-1;

        while(start<end){
            if(str.charAt(start) != str.charAt(end))
                return number+" is Not Palindrome";
            end--;
            start++;
        }
        return number+" is Palindrome";
    }
}
