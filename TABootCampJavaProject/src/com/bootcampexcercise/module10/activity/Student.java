package com.bootcampexcercise.module10.activity;

public class Student extends Person {

    private String schoolName;

    public Student (){
    this.schoolName = "no name";
    }

    public String getJobTitle() {
        return null;
    }

    public void setJobTitle(String jobTitle) {

    }

    public String getCompany() {
        return null;
    }

    public void setCompany(String company) {

    }


    public double getSalary() {
        return 0;
    }


    public void setSalary(double salary) {
    }

    public String getSchoolName() {
        return schoolName;
    }


    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;

    }

    public void announce() {
        System.out.println("My name is " + getName() + " and my age is " + getAge()+ ". I am studying in " + getSchoolName());
    }

}
