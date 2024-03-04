package org.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("BeanConfig.xml");
        //register shutdown hook for destroy method
        context.registerShutdownHook();
        Student student = context.getBean("student", Student.class);
        Student1 student1 = context.getBean("student1", Student1.class);
        System.out.println(student.getName()+" "+student.getId());
        System.out.println(student1.getName()+" "+student1.getId());

    }
}
