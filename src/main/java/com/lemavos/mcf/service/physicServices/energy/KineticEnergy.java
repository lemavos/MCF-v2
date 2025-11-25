package com.lemavos.mcf.service.physicServices.energy;

import org.springframework.stereotype.Service;

@Service
public class KineticEnergy {
    public static String calculateKinectEnergy(double mass, double velocity){
        if (mass <= 0){
            return "Mass cannot be equal or minor than zero!";
        }
        double KineticEnergy = (mass * Math.pow(velocity, 2)) / 2;
        return "Kinect energy equal: "+ KineticEnergy;
    }
}
