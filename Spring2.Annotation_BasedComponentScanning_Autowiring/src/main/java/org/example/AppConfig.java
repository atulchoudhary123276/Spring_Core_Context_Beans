package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//only annotation based spring app for multiple classes beans
@Configuration
@ComponentScan(basePackages = "org.example") //create all components beans
public class AppConfig {
//    @Bean(name = "dog")
//    Dog createDog(){
//        return new Dog();
//    }
//    @Bean(name = "cat")
//    Cat createcat(){
//        return new Cat();
//    }
//
//    @Bean(name = "animal")
//    Animal createAnimal(){
//        Animal animal=new Animal();
//        animal.setAnimal(createcat());
//        return animal;
//    }
}
