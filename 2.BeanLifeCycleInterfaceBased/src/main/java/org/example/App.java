package org.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("BeanConfig.xml");
        context.registerShutdownHook();
        Student student = context.getBean("student", Student.class);
        System.out.println(student.getName()+" "+student.getId());

    }
}
