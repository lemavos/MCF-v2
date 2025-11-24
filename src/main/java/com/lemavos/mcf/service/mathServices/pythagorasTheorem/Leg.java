package com.lemavos.mcf.service.mathServices.pythagorasTheorem;

public class Leg {
    public static String calculateLeg(double hypotenuse, double leg1){
        if (hypotenuse <= 0 || leg1 <= 0){
            return "Hypotenuse and leg lengths must be positive numbers.";
        }
        if (leg1 >= hypotenuse){
            return "Leg length must be less than the hypotenuse.";
        }
        double leg2 = Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(leg1, 2));
        return "The length of the other leg is: " + leg2;
    }
}
