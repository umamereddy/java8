package com.javatechie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDataBase {

    public static List<Employee> getEmployees(){
        List<Employee> employees = Stream.of(new Employee(101, "john", 60000, "A"),
            new Employee(109, "Alex", 70000, "B"),
            new Employee(104, "Brem", 70000, "A"),
            new Employee(103, "Cary", 40000, "C"),
            new Employee(102, "Wagon", 90000, "A")).collect(Collectors.toList());
        return employees;
    }
}
