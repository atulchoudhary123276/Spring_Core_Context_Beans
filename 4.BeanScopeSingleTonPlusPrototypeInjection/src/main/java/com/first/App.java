package com.first;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.first");
        Mybean myBean =context.getBean("myBean",Mybean.class);
        System.out.println("mybean- DI -"+myBean.getMyBean2());  //it gives new obj real
        System.out.println("mybean- DI -"+myBean.getMyBean2());  //it also gives new real obj
        System.out.println("----------------");

        Mybean myBean1 =context.getBean("myBean",Mybean.class);
        System.out.println("mybean "+myBean1.hashCode());
        System.out.println("mybean DI -"+myBean1.getMyBean2());    //it also gives new real obj


        //PROTOTYPE DI INTO SINGLETON INJECT ONLY ONCE WHEN MYBEAN BEAN IS STORE INTO CONTAINER
        //IF YOU WANT A NEW PROTOTYPE INJECTED INTO MYBEAN(SINGLETON) SO USE PROXY
        //          ---when you change the proxy mode, Spring creates and injects a special proxy object instead of the real object.

    }
}
