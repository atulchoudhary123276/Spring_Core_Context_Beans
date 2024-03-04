package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    private String name;
    public Address add;
//    @Autowired     //bytype
//  @Qualifier("add2")
    
    public Address getAdd() {
        return add;
    }
//    @Autowired
    public void setAdd(Address add) {
        System.out.println("Hitting setter method");
        this.add = add;
    }
//    public Student() {
//        System.out.println("default cons");
//    }
//    public Student(String name){
//        this.name=name;
//    }
//    @Autowired
//   public Student(Address a){
//        System.out.println("hitting stud const with add ref");
//        this.add=a;
//   }
//   @Autowired
    public Student(String name,Address add) {
        this.name = name;
        this.add=add;
        System.out.println("Hitting Constructor");

    }


}
