package com.Example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//class based configuration --Annotation based
@Configuration
public class AppConfig {
    @Bean(name = "hello")
    Hello getStudentObj(){
        return new Hello();
    }

}
