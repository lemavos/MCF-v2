package com.lemavos.mcf.service.mathServices.shapes;
import org.springframework.stereotype.Service;

@Service
public class Square {
    public static String calculateSquareArea(double side){
        if (side <= 0){
            return "Side length must be a positive number.";
        }
        double area = side * side;
        return "The area of the square is: " + area;
    }

    public static String calculateSquarePerimeter(double side){
        if (side <= 0 ){
            return "Side length must be a positive number.";
        }
        double perimeter = 4 * side;
        return "The perimeter of the square is: " + perimeter;
    }
}
