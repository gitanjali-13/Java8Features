package com.lambdaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empid;
    String empname;
    int salary;

    public Employee(int empid, String empname, int salary) {
        super();
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }
}

public class UseFilterMapMethod {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(101, "Amod", 25000));
        employeeList.add(new Employee(102, "Ashish", 30000));
        employeeList.add(new Employee(103, "Neha", 40000));
        employeeList.add(new Employee(104, "pravin", 50000));

        //combination of filter and map
        List<Integer> employeeSal = employeeList.stream().filter(e -> e.salary > 35000).map(e -> e.salary).collect(Collectors.toList());
        System.out.println(employeeSal);

    }

}

