package com.javatechie;

import java.util.Arrays;

public class JavaEqualsAndhashcode {

    public static void main(String[] args) {
        Customer c1 = new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725"));
        Customer c2 = new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725"));


        System.out.println("Shallow compare " + (c1 == c2));
        System.out.println("Deep compare " + c1.equals(c2));

    }
}
