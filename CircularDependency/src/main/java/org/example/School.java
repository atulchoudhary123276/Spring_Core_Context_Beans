package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class School {
    private Student student;

    public School() {
        System.out.println("dft cons school");
    }

    @Autowired                                               //--solution
    public School( @Lazy Student student){      //1.@Lazy use in any one constructor of circular dependent beans
        this.student=student;                   //2.use setter/field injection instead of constructor injection in circular dependent beans
    }
    public void setStudent(Student student){
        this.student=student;
    }
    public Student getStudent(){
        return student;
    }
}
