package org.example;

import org.springframework.beans.factory.annotation.Value;

public class MyBean {
    @Value("atul")
    private String name;

    public String getName() {
        return name;
    }
}