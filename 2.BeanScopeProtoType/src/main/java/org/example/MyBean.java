package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//use can also use annotation for scope changing
//@Component
//@Scope("prototype")
public class MyBean {
    MyBean(){
        System.out.println("mybean1");
    }
    @Autowired
    private MyBean2 myBean2;
    @Value("atul")
    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyBean2 getMyBean2() {
        return myBean2;
    }
}