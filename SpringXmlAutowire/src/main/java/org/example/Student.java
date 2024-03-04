package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    private int id;   //int did not work in autowiring
    private String name;
    private Address address;

    public Student(int id,String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("constructor");
    }

    public void setAddress(Address address) {
        this.address = address;
        System.out.println("setter");
    }

    public Address getAddress(){
        return address;
    }




}
