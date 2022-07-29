package com.bootcampexcercise.module10.activity1_2;

import com.bootcampexcercise.module10.activity1_2.Person;

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
