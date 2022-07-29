package com.bootcampexcercise.module10.activity6;

public class InterfaceActivityClass {
    public static void main(String[] args) {

        Bike bike = new Bike();
        Car car = new Car();

        bike.start();
        bike.stop();

        car.start();
        car.stop();
    }
}

