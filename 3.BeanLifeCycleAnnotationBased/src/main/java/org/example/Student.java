package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class Student {
    @Value("120")
    private int id;
    @Value("atul")
    private String name;

    public Student() {
        System.out.println("constructor -value initialization");
    }

//    public Student(int id, String name) {
//        this.id = id;
//        this.name = name;
//        System.out.println("constructor -value initialization");
//    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    @PostConstruct
    public void start(){     //inti method name anything with same signature --Initialization code ,Loading config,Connecting db, Webservice etc
        System.out.println("inti method of bean life cycle ,which execute after initialization ");
    }

    @PreDestroy
    public void destroy(){    //its name also anything but signature always same
        System.out.println("destroy  method of bean life cycle for cleanup resources" +
                " ,which execute before end of program ");
    }


}
