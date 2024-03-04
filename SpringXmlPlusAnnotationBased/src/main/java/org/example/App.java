package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("autoConfig.xml");
        Student s=context.getBean("student", Student.class);
//        System.out.println(s);
        System.out.println(s.getAdd());
    }
}
