package com.bootcampexcercise.module10.activity;

public abstract class Person {

    private String name;
    private int age;

    public Person (){
        this.name = "no name";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String getJobTitle();

    public abstract void setJobTitle(String jobTitle);

    public abstract String getCompany();

    public abstract void setCompany(String jobTitle);

    public abstract double getSalary();

    public abstract void setSalary(double salary);

    public abstract String getSchoolName();

    public abstract void setSchoolName(String schoolName);


    public void announce() {
        System.out.println("My name is " + name + " and my age is " + age);
    }


}
