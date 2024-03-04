package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args ) {
        //xml based configuration spring application
//        Resource resource=new ClassPathResource("BeanConfig.xml");
//        BeanFactory container=new XmlBeanFactory(resource);
//        Student student1= (Student) container.getBean(("student1"));

        ApplicationContext context = new ClassPathXmlApplicationContext("BeanConfig.xml");
        Student student1 = (Student) context.getBean(("student1"));

        System.out.println(student1);
        System.out.println(student1.getHello());

    }
}
