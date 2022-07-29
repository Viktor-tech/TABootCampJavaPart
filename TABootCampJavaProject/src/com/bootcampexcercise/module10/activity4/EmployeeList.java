package com.bootcampexcercise.module10.activity4;

import com.bootcampexcercise.module10.activity1_2.Employee;


import java.util.*;



public class EmployeeList {


    public static void main(String[] arg) {


        List <Employee> employeeList = new ArrayList <Employee>();

        Employee person1 = new Employee("President", "Government", 100000);
        Employee person2 = new Employee("Janitor", "House management", 500);
        Employee person3 = new Employee("Nurse", "Hospital", 1500);
        Employee person4 = new Employee("Driver", "Shipping company", 1200);
        Employee person5 = new Employee("Builder", "Real estate agency", 2000);

        employeeList.add(person1);
        employeeList.add(person2);
        employeeList.add(person3);
        employeeList.add(person4);
        employeeList.add(person5);


        EmployeeList obj = new EmployeeList();
        obj.getHighestPaidEmp(employeeList);
    }


    public String getHighestPaidEmp(List<Employee> employeeList) {
        Employee salary = new Employee();
        salary = employeeList.get(0);
        double salaryMax = salary.getSalary();
        String emp = salary.getName();
        for (int i = 0; i < employeeList.size(); i++) {
            salary = employeeList.get(i);
            if (salaryMax < salary.getSalary()) {
                salaryMax = salary.getSalary();
                emp = salary.getName();
            }
        }
        return emp;

    }

}