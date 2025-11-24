package com.lemavos.mcf.service.mathServices.pythagorasTheorem;

public class Hypotenuse {
    public static String calculateHypotenuse(double leg1, double leg2){
        if (leg1 <= 0 || leg2 <= 0){
            return "Leg lengths must be positive numbers.";
        }
        double hypotenuse = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
        return "The length of the hypotenuse is: " + hypotenuse;
    }
}
