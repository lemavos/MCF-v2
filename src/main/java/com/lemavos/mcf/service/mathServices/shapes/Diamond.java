package com.lemavos.mcf.service.mathServices.shapes;

public class Diamond {
    public static String calculateDiamondArea(double diagonal1, double diagonal2){
        if (diagonal1 <= 0 || diagonal2 <= 0){
            return "Diagonals must be positive numbers.";
        }
        double area = (diagonal1 * diagonal2) / 2;
        return "The area of the diamond is: " + area;
    }

    public static String calculateDiamondPerimeter(double side){
        if (side <= 0 ){
            return "Side length must be a positive number.";
        }
        double perimeter = 4 * side;
        return "The perimeter of the diamond is: " + perimeter;
    }
}
