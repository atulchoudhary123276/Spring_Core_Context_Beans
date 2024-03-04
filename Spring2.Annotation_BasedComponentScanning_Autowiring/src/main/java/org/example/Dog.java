package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary                          //3.AutoWire type for injecting bean in dependent class
public class Dog implements AnimalType {
    @Value("bojo")
    private String name;
    @Value("White")
    private String color;

    public Dog() {
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void sound() {
        System.out.println("bho bho");
    }

    @Override
    public String getMyname() {
        return name;
    }
}
