package org.example;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean , DisposableBean {
    private int id;
    private String name;
    public Student() {
        System.out.println("default con");
    }
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("constructor -value initialization");
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public void afterPropertiesSet(){     //inti method --Initialization code ,Loading config,Connecting db, Webservice etc
        System.out.println("inti method of bean life cycle ,which execute after initialization ");

    }
    @Override
    public void destroy(){
        System.out.println("destroy  method of bean life cycle for cleanup resources" +
                " ,which execute before end of program ");

    }
}
