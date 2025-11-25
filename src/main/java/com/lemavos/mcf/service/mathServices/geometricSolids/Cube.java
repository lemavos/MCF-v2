package com.lemavos.mcf.service.mathServices.geometricSolids;

import org.springframework.stereotype.Service;

@Service
public class Cube {
    public static double calculateVolumeCube(double side) {
        return Math.pow(side, 3);
    }

    public static double calculateSurfaceAreaCube(double side) {
        return 6 * Math.pow(side, 2);
    }
}
