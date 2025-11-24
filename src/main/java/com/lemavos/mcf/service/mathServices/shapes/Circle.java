package com.lemavos.mcf.service.mathServices.shapes;

public class Circle {
    public static String calculateCircleArea(double radius){
        if (radius <= 0 ){
            return "Radius must be a positive number.";
        }
        double area = Math.PI * Math.pow(radius, 2);
        return "The area of the circle is: " + area;
    }

    public static String calculateCircunference(double radius){
        if (radius <= 0 ){
            return "Radius must be a positive number.";
        }
        double area = 2 * Math.PI * radius;
        return "The area of the circle is: " + area;
    }
}
