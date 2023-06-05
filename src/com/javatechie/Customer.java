package com.javatechie;

import java.util.List;
import java.util.Objects;

public class Customer {
    private int id;
    private String name;
    private String email;
    private List<String> phoneNumbers;


    public Customer(){

    }

    public Customer(int id, String name, String email, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(phoneNumbers, customer.phoneNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phoneNumbers);
    }*/
    @Override
    public boolean equals(Object o) {
        if(o == null || getClass() != o.getClass()){
            return  false;
        }
        if( o == this) {
            return true;
        }

        Customer customer = (Customer)o;
        return id == customer.id && Objects.equals(name, customer.name) &&
                Objects.equals(email, customer.email) &&
                Objects.equals(phoneNumbers, customer.phoneNumbers);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name, email, phoneNumbers);
    }




    //Equals and hashcode comparsiion.

    /*1) if 2 objects are equals according to the equals(Object o) method
         Then the hascode of  both the objects must be same(Integer val);
      -> So where ever you override the equals method you must override hashcode() method.

      3) It's not necessary that if you have same hascode for two objects means those two objects
         are equals. This is collision. Better hashfunction prevents this.

      4) whenever you invoked on the same object morethan once During an execution of java application
         the hashcode method must consistently return the same integer.
     */

}
