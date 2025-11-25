package com.lemavos.mcf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lemavos.mcf.service.physicServices.Force;
import com.lemavos.mcf.util.ValueValidator;

@RestController
@RequestMapping("api/physic")
public class PhysicController {
    
    // Detached
    @GetMapping("/force")
    public ResponseEntity<?> Force(@RequestParam double mass,
                                             @RequestParam double acceleration) {
        ValueValidator.isNull(mass, acceleration);
        ValueValidator.aEqualZero(mass);
        return ResponseEntity.ok(Force.calculateForce(mass, acceleration));
    }

    // Kinect Energy
    @GetMapping("/force")
    public ResponseEntity<?> KinectEnergy(@RequestParam double mass,
                                             @RequestParam double velocity) {
        ValueValidator.isNull(mass, velocity);
        ValueValidator.aEqualZero(mass);
        return ResponseEntity.ok(Force.calculateForce(mass, velocity));
    }
}
