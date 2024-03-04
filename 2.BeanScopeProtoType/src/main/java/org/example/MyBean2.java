package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
public class MyBean2 {
    @Value("atulchudhary")
    private String name;
    MyBean2(){
        System.out.println("mybean2");
    }

    public String getName() {
        return name;
    }
}
