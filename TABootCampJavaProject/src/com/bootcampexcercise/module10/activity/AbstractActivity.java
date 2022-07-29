package com.bootcampexcercise.module10.activity;

public class AbstractActivity {

    public static void main(String[] args) {
        Person e = new Employee();
        Person s = new Student();

        e.setName("Edgars");
        e.setAge(23);
        e.setJobTitle("Developer");
        e.setCompany("Microsoft");
        e.setSalary(1500);

        s.setName("Janis");
        s.setAge(15);
        s.setJobTitle("Student");
        s.setSchoolName("Technical University");

        e.announce();
        s.announce();

    }


}
