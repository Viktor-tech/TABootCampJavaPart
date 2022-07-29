package com.bootcampexcercise.module10.activity;

public class Student extends Person {

    private String schoolName;

    public Student (){
    this.schoolName = "no name";
    }

      public String getSchoolName() {
        return this.schoolName;
    }


    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;

    }

    public void announce() {
        System.out.println("I am studying in " + getSchoolName());
    }

}
