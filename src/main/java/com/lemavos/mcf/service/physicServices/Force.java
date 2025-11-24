package com.lemavos.mcf.service.physicServices;

import org.springframework.stereotype.Service;

@Service
public class Force {
    public static String calculateForce(double mass, double acceleration){
        if (mass <= 0){
            return "Mass cannot be equal or minor than zero!";
        }

        double force = mass * acceleration;
        return "Force equals: "+ force;
    }

}
