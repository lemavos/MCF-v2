package com.lemavos.mcf.service.mathServices.geometricSolids;

import org.springframework.stereotype.Service;

@Service
public class Sphere {
    public static double calculateVolumeSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double calculateSurfaceAreaSphere(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
