package com.bootcampexcercise.module5.activity;

//TODO: change Shape class to abstract

public abstract class Shape {

    public String color;

    public Shape() {
    }

//TODO:  Add abstract method calculateArea() and calculatePerimeter() with return type as double

    public abstract double calculateArea();

    public abstract double calculatePerimeter();


    public void setColor(String name) {
        color = name;
    }


    public String getColor() {
        return color;
    }


}