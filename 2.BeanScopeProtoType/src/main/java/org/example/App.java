package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("BeanConfig.xml");
        MyBean myBean =context.getBean("myBean",MyBean.class);
        System.out.println(myBean.getName());
        System.out.println(myBean.hashCode());
//        myBean.setName("atul3");
        System.out.println(myBean.getName());
        System.out.println("singleton"+myBean.getMyBean2().hashCode());

        MyBean myBean1 =context.getBean("myBean",MyBean.class);
        System.out.println(myBean1.hashCode());
        System.out.println("singleton"+myBean1.getMyBean2().hashCode());

    }
}
