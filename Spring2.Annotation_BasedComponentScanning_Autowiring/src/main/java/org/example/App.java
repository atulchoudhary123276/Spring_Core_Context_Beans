package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//        Animal a=context.getBean("animal", Animal.class);   //for bean based configuration in java class use name of bean
        Animal a=context.getBean(Animal.class);
        a.getSound();
        System.out.println(a.getMyName());
    }
}
