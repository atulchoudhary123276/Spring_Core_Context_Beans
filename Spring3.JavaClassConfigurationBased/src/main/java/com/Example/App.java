package com.Example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        //java based class configuration
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Hello s1=applicationContext.getBean("hello",Hello.class);
        System.out.println(s1.getHello());
    }
}
