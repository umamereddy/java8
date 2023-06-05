package com.javatechie;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    //find a customer by using email
    public static Customer getCutomerByEmail(String email) throws Exception {
        List<Customer> customers = EkartDataBase.getAll();
        return customers.stream().filter(customer -> customer.getEmail().equals(email)).
                findAny().orElseThrow(() -> new Exception("no customer present in DB "));

    }
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(101, "test", "abc@gmail.com", Arrays.asList("213231231", "45656457567"));

        //Optional can create by
        //of
        //empty
        //ofNullable

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        /*Optional<String> email = Optional.of(customer.getEmail());
        System.out.println(email);*/

        /*Optional<String> email1 = Optional.of(Optional.ofNullable(customer.getEmail()).orElseThrow(() -> new IllegalArgumentException("email not present")));
        System.out.println(email1.orElseGet(() -> "defalut email..."));*/
        getCutomerByEmail("pqr");

    }
}
