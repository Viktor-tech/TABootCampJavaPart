package com.bootcampexcercise.module5.activity;

public class AbstractActivity {
    public static void main(String args[]) {

        // set and Print color of rectangle
        Rectangle newRectangle = new Rectangle(5, 6);
        newRectangle.setColor("black");
        System.out.println("Color of rectangle - " + newRectangle.getColor());

        // Give area of rectangle
        System.out.println("Area of rectangle - " + newRectangle.calculateArea());

        // Print perimeter of rectangle
        System.out.println("Perimeter of circle - " + newRectangle.calculatePerimeter());

        // set and Print color of circle
        Circle newCircle = new Circle(5);
        newCircle.setColor("white");
        System.out.println("Color of circle - " + newCircle.getColor());

        // Give area of circle
        System.out.println("Area of circle - " + newCircle.calculateArea());

        // Print perimeter of circle
        System.out.println("Perimeter of circle - " + newCircle.calculatePerimeter());
    }
}
