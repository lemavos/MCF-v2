package com.lemavos.mcf.service.mathServices;

import org.springframework.stereotype.Service;

@Service
public class Factorial {
    public static String calculateFactorial(double number){
        if (number < 0){
            return "Undefined for negative numbers";
        }
        if (number == 0 || number == 1){
            return "Factorial for " + number + " is 1";
        }
        long factorial = 1;

        StringBuilder steps = new StringBuilder("1");
        for (int i = 2; i <= number; i++){
            factorial *= i;
            steps.append(" * ").append(i);
        }
        return "Result of " + number + "! is: " + steps + " = " + factorial;
        
    }
}
