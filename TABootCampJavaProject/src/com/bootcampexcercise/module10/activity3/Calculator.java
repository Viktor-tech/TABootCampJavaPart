package com.bootcampexcercise.module10.activity3;

public class Calculator extends Throwable {

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double div(double a, double b) throws ArithmeticException {
        double divresult = 0;
        try {
            divresult = a / b;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Division by 0 impossible");
        }
        return divresult;
    }

    public double mult(double a, double b) throws CustomException {
        double multresult = a * b;
        if (multresult == 0) {
            throw new CustomException();
        } else {
            return multresult;
        }


    }
}
