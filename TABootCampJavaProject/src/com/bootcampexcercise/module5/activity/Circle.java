package com.bootcampexcercise.module5.activity;

import java.security.PublicKey;

public class Circle extends Shape {
    // TODO: Implement calculateArea and calculatePerimeter in this class

    public double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public double calculatePerimeter() {
        return 3.14 * radius * 2;
    }


    public double calculateArea() {
        return 3.14 * (radius * radius);
    }



}