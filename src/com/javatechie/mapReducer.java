package com.javatechie;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapReducer {

    public static void main(String[] args) {

        //reduce method is used for aggrigate , combines the stream of data and result into desired val

        //1 . find the sum of integers.
        List<Integer> numbers = Stream.of(1, 2, 3, 4, 9, 7, 8).collect(Collectors.toList());
        List<String> words = Stream.of("ZXD", "ABC", "GHY").collect(Collectors.toList());

        int sum =0;
        for(int no: numbers)
            sum=sum+no;
        System.out.println(sum);


        Optional<Integer> sumaAsMethodRef = numbers.stream().reduce(Integer::sum);
        System.out.println(sumaAsMethodRef.get());

        Integer reduce = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);

        //find max value
        Integer maxVal = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxVal);

        //Sort the integres
        List<Integer> integers= numbers.stream().sorted(Comparable::compareTo).collect(Collectors.toList());
        System.out.println(integers);

        //find highest length string
        Optional<String> reduce1 = words.stream().reduce((a, b) -> a.length() > b.length() ? a : b);
        System.out.println(reduce1);

        //String order
        List<String> collect = words.stream().sorted(Comparable::compareTo).collect(Collectors.toList());
        System.out.println(collect);

        words.stream().filter(s -> s.equals("yyy")).forEach(System.out::println);

       //Find an average salary of grade "A" Employee from DB.
       //1 get an employee whose grade is "A"

        double avgSalaryOfGradeAEmp = EmployeeDataBase.getEmployees().stream().
                filter(employee -> employee.getGrade().equals("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(value -> value)
                .average().getAsDouble();

        System.out.println(avgSalaryOfGradeAEmp);

        //Highest salary from employees

       Optional<Employee> employee = EmployeeDataBase.getEmployees().stream()
               .sorted(Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName).reversed()).skip(2).findFirst();

        System.out.println(employee.get());

        //find out total employee salary of employees
        Optional<Double> doubleOptional = Optional.of(EmployeeDataBase.getEmployees().stream()
                .map(Employee::getSalary)
                .reduce((aDouble, aDouble2) -> aDouble+aDouble2).get());
        System.out.println(doubleOptional.get());

        Optional<Employee> collect1 = EmployeeDataBase.getEmployees().stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary).reversed()));
        System.out.println(collect1.get());

    }
}
