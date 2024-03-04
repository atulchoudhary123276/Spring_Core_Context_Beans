package org.example;

public class Student {
    private int id;
    private String name;

    public Student() {

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

    public void init(){     //inti method name anything with same signature --Initialization code ,Loading config,Connecting db, Webservice etc
        System.out.println("inti method of bean life cycle ,which execute after initialization ");
    }

    public void destroy(){    //its name also anything but signature always same
        System.out.println("destroy  method of bean life cycle for cleanup resources" +
                " ,which execute before end of program ");
    }


}
