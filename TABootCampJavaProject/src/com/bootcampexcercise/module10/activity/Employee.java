package com.bootcampexcercise.module10.activity;

public class Employee extends Person {

    private String jobTitle;
    private String company;
    private double salary;

    public Employee() {
        this.jobTitle = "no job title";
        this.company = "no company";
        this.salary = 0;
    }

     public Employee(String jobTitle, String company, double salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




    public String getSchoolName() {
        return null;
    }

    public void setSchoolName(String schoolName) {

    }

    public void announce() {
        System.out.println("My name is " + getName() + " and I am " + getAge() + " years old." +
                " I work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }

}
