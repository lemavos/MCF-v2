package com.lemavos.mcf.service.mathServices.geometricSolids;

public class TrapezoidalPrism {
    public static double calculateVolumeTrapezoidalPrism(double a, double b, double h, double length) {
        double areaBase = ((a + b) / 2) * h;
        return areaBase * length;
    }

    public static double calculateSurfaceAreaTrapezoidalPrism(double a, double b, double h, double length) {
        double areaBase = ((a + b) / 2) * h;
        double side1 = a * length;
        double side2 = b * length;
        double side3 = Math.sqrt(Math.pow(h, 2) + Math.pow((b - a) / 2, 2)) * length;
        return 2 * areaBase + side1 + side2 + 2 * side3;
    }
}
