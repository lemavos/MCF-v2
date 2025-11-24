package com.lemavos.mcf.service.mathServices;

public class Bhaskara {
    public static String calculateBhaskara(double a, double b, double c) {
        double delta = calculateDelta(a, b, c);
        
        if (delta < 0) {
            return "Delta is negative, no real roots.";
        }
        
        if (delta == 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            return "One real root: " + root1;
        }
        
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        return "Two real roots: " + root1 + " and " + root2;
    }

    private static double calculateDelta(double a, double b, double c) {
        return (b * b) - 4 * a * c;
    }

}