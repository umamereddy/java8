package com.javatechie;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class mapVsflatMap {

    public static void main(String[] args) {
        List<Customer> customerList = EkartDataBase.getAll();

      customerList.stream().distinct().
                forEach(System.out::println);

      System.out.println("****************************************************");

       Set<Customer> customerSet = new HashSet<>(customerList);
       customerSet.stream().sorted(Comparator.comparing(Customer::getId).thenComparing(Customer::getName)).forEach(System.out::println);



    }
}
