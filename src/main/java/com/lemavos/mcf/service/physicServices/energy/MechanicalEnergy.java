package com.lemavos.mcf.service.physicServices.energy;

import org.springframework.stereotype.Service;

@Service
public class MechanicalEnergy {
    public static String calculateMechanicalEnergy(double kineticEnergy, double potentialEnergy){
        
        double mechanicalEnergy = kineticEnergy + potentialEnergy;
        
        return "Mechanical energy equals: "+ mechanicalEnergy;
    }
}
