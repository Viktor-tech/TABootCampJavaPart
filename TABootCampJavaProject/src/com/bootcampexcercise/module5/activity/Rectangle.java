package com.bootcampexcercise.module5.activity;

public class Rectangle extends Shape {
    // TODO: Implement calculateArea and calculatePerimeter in this class
    private double length;
    private double width;

    public Rectangle() {
        this.length = 5;
        this.width = 6;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea () {
        return length * width;
    }

    public double calculatePerimeter() {
        return (length + width) * 2;
    }
}