package com.lemavos.mcf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lemavos.mcf.service.mathUtils.Bhaskara;
import com.lemavos.mcf.service.mathUtils.Factorial;
import com.lemavos.mcf.service.mathUtils.geometricSolids.Cube;
import com.lemavos.mcf.service.mathUtils.geometricSolids.Parallelepiped;
import com.lemavos.mcf.service.mathUtils.geometricSolids.Sphere;
import com.lemavos.mcf.service.mathUtils.geometricSolids.TrapezoidalPrism;
import com.lemavos.mcf.service.mathUtils.pythagorasTheorem.Hypotenuse;
import com.lemavos.mcf.service.mathUtils.pythagorasTheorem.Leg;
import com.lemavos.mcf.service.mathUtils.shapes.Circle;
import com.lemavos.mcf.service.mathUtils.shapes.Diamond;
import com.lemavos.mcf.service.mathUtils.shapes.Rectangle;
import com.lemavos.mcf.service.mathUtils.shapes.Square;

import com.lemavos.mcf.util.ValueValidator;

@RestController
@RequestMapping("api/math")
public class MathController {

    // Detached
    @GetMapping("/bhaskara")
    public ResponseEntity<?> Bhaskara(@RequestParam double a,
                                             @RequestParam double b,
                                             @RequestParam double c) {
    
        ValueValidator.isNull(a, b, c);
        ValueValidator.aEqualZero(a);
        return ResponseEntity.ok(Bhaskara.calculateBhaskara(a, b, c));
    }

    @GetMapping("/factorial")
    public ResponseEntity<?> Factorial(@RequestParam double number) {
        ValueValidator.isNull(number);
        ValueValidator.isPositive(number);
        return ResponseEntity.ok(Factorial.calculateFactorial(number));
    }

    // Pythagoras Theorem

    @GetMapping("pythagoras/hypotenuse")
    public ResponseEntity<?> Hypotenuse(@RequestParam double leg1,
                                                @RequestParam double leg2) {
        ValueValidator.isNull(leg1, leg2);
        ValueValidator.isPositive(leg1, leg2);
        return ResponseEntity.ok(Hypotenuse.calculateHypotenuse(leg1, leg2));
    }

    @GetMapping("pythagoras/leg")
    public ResponseEntity<?> Leg(@RequestParam double hypotenuse,
                                        @RequestParam double leg1) {
        ValueValidator.isNull(leg1, hypotenuse);
        ValueValidator.isPositive(leg1, hypotenuse);
        return ResponseEntity.ok(Leg.calculateLeg(hypotenuse, leg1));
    }

    // Shapes
        // circle area
    @GetMapping("shapes/circle")
    public ResponseEntity<?> CircleArea(@RequestParam double radius) {
        ValueValidator.isNull(radius);
        ValueValidator.isPositive(radius);
        return ResponseEntity.ok(Circle.calculateCircleArea(radius));
    }
        // circle circunference
    @GetMapping("shapes/circunference")
    public ResponseEntity<?> Circunference(@RequestParam double radius) {
        ValueValidator.isNull(radius);
        ValueValidator.isPositive(radius);
        return ResponseEntity.ok(Circle.calculateCircunference(radius));
    }

        // Diamond area
    @GetMapping("area/diamond")
    public ResponseEntity<?> DiamondArea(@RequestParam double diagonal1,
                                                @RequestParam double diagonal2) {
        ValueValidator.isNull(diagonal1, diagonal2);
        ValueValidator.isPositive(diagonal1, diagonal2);
        return ResponseEntity.ok(Diamond.calculateDiamondArea(diagonal1, diagonal2));
    }

        // Diamond perimeter
    @GetMapping("perimeter/diamond")
    public ResponseEntity<?> DiamondPerimeter(@RequestParam double side) {
        ValueValidator.isNull(side);
        ValueValidator.isPositive(side);
        return ResponseEntity.ok(Diamond.calculateDiamondPerimeter(side));
    }

        // Rectangle Area
    @GetMapping("area/rectangle")
    public ResponseEntity<?> RectangleArea(@RequestParam double length,
                                                    @RequestParam double width) {
        ValueValidator.isNull(length, width);
        ValueValidator.isPositive(length, width);
        return ResponseEntity.ok(Rectangle.calculateRectangleArea(length, width));
    }

        // Rectangle Perimeter
    @GetMapping("perimeter/rectangle")
    public ResponseEntity<?> RectanglePerimeter(@RequestParam double length,
                                                    @RequestParam double width) {
        ValueValidator.isNull(length, width);
        ValueValidator.isPositive(length, width);
        return ResponseEntity.ok(Rectangle.calculateRectanglePerimeter(length, width));
    }

        // Square Area
    @GetMapping("area/square")
    public ResponseEntity<?> squareArea(@RequestParam double side) {
        ValueValidator.isNull(side);
        ValueValidator.isPositive(side);
        return ResponseEntity.ok(Square.calculateSquareArea(side));
    }

        // Square perimeter
    @GetMapping("perimeter/square")
    public ResponseEntity<?> squarePerimeter(@RequestParam double side) {
        ValueValidator.isNull(side);
        ValueValidator.isPositive(side);
        return ResponseEntity.ok(Square.calculateSquarePerimeter(side));
    }

    // Geometric Solids
        // cube volume
    @GetMapping("volume/cube")
    public ResponseEntity<?> cubeVolume(@RequestParam double side) {
        ValueValidator.isNull(side);
        ValueValidator.isPositive(side);
        return ResponseEntity.ok(Cube.calculateVolumeCube(side));
    }

        // cube surface
    @GetMapping("surface/cube")
    public ResponseEntity<?> cubeSurface(@RequestParam double side) {
        ValueValidator.isNull(side);
        ValueValidator.isPositive(side);
        return ResponseEntity.ok(Cube.calculateSurfaceAreaCube(side));
    }

        // parallelepiped volume
    @GetMapping("volume/parallelepiped")
    public ResponseEntity<?> parallelepipedVolume(@RequestParam double length,
                                        @RequestParam double width, 
                                        @RequestParam double height) {
        ValueValidator.isNull(length, width, height);
        ValueValidator.isPositive(length, width, height);
        return ResponseEntity.ok(Parallelepiped.calculateVolumeParallelepiped(length, width, height));
    }

        // parallelepiped surface
    @GetMapping("surface/parallelepiped")
    public ResponseEntity<?> parellelepipedSurface(@RequestParam double length,
                                        @RequestParam double width, 
                                        @RequestParam double height) {
        ValueValidator.isNull(length, width, height);
        ValueValidator.isPositive(length, width, height);
        return ResponseEntity.ok(Parallelepiped.calculateSurfaceAreaParallelepiped(length, width, height));
    }

        // Sphere volume
    @GetMapping("volume/sphere")
    public ResponseEntity<?> SphereVolume(@RequestParam double radius) {
        ValueValidator.isNull(radius);
        ValueValidator.isPositive(radius);
            return ResponseEntity.ok(Sphere.calculateVolumeSphere(radius));
    }

        // Sphere surface
    @GetMapping("surface/sphere")
    public ResponseEntity<?> SphereSurface(@RequestParam double radius) {
        ValueValidator.isNull(radius);
        ValueValidator.isPositive(radius);
        return ResponseEntity.ok(Sphere.calculateSurfaceAreaSphere(radius));
    }

        // trapezoidal Prism volume
    @GetMapping("volume/trapezoidalprism")
    public ResponseEntity<?> trapezoidalPrismVolume(@RequestParam double a, 
                                                    @RequestParam double b, 
                                                    @RequestParam double h, 
                                                    @RequestParam double length) {
        ValueValidator.isNull(a, b, h, length);
        ValueValidator.isPositive(a, b, h, length);
            return ResponseEntity.ok(TrapezoidalPrism.calculateVolumeTrapezoidalPrism(a, b, h, length));
    }

        // trapezoidal Prism surface
    @GetMapping("surface/trapezoidalprism")
    public ResponseEntity<?> trapezoidalPrismSurface(@RequestParam double a, 
                                                    @RequestParam double b, 
                                                    @RequestParam double h, 
                                                    @RequestParam double length) {
        ValueValidator.isNull(a, b, h, length);
        ValueValidator.isPositive(a, b, h, length);
        return ResponseEntity.ok(TrapezoidalPrism.calculateSurfaceAreaTrapezoidalPrism(a, b, h, length));
    }
}
