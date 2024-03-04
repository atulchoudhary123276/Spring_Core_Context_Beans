package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class Student1 {
    @Value("121")
    private int id;
    @Value("atul chaudhary")
    private String name;

    public Student1() {
        System.out.println("constructor -value student1 initialization");

    }

//    public Student1(int id, String name) {
//        this.id = id;
//        this.name = name;
//        System.out.println("constructor -value student1 initialization");
//    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    @PostConstruct
    public void start(){     //inti method name anything with same signature --Initialization code ,Loading config,Connecting db, Webservice etc
        System.out.println("s1 inti method of bean life cycle ,which execute after initialization ");
    }

    @PreDestroy
    public void destroy(){    //its name also anything but signature always same
        System.out.println(" s1 destroy  method of bean life cycle for cleanup resources" +
                " ,which execute before end of program ");
    }


}
