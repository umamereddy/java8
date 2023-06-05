package com.javatechie;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private String grade;

    public Employee(int id, String name, double salary, String grade) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
       return   "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(grade, employee.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, grade);
    }
}
