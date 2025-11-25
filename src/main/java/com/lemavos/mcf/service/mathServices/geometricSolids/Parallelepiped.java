package com.lemavos.mcf.service.mathServices.geometricSolids;

import org.springframework.stereotype.Service;

@Service
public class Parallelepiped {
    public static double calculateVolumeParallelepiped(double length, double width, double height) {
        return length * width * height;
    }

    public static double calculateSurfaceAreaParallelepiped(double length, double width, double height) {
        return 2 * (length * width + width * height + height * length);
    }
}
