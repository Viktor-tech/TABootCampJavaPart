package com.bootcampexcercise.module10.activity;

public class AbstractActivity {

    public static void main(String[] args) {

        Employee e = new Employee();
        Student s = new Student();

        e.setName("Janis");
        e.setAge(30);
        e.setJobTitle("Manager");
        e.setCompany("Swedbank");
        e.setSalary(1000.50);
        s.setSchoolName("Latvian University");



        e.announce();
        s.announce();

    }


}
