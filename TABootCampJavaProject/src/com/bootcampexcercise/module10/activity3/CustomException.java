package com.bootcampexcercise.module10.activity3;

public class CustomException extends Exception {
    public String getMessage() {
        return "You have been multiplied by 0";
    }

}