package com.first;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "myBean")
@Scope(value = "singleton")
public class Mybean {
    @Value("atul")
    private String name;
    @Autowired
    private Mbean2 myBean2;//prototype

    public Mybean() {
        System.out.println("cons mybean");
    }

    public Mbean2 getMyBean2() {
        return myBean2;
    }

    public String getName() {

        return name;
    }
//    @Lookup                             //Alternate way
//    public Mbean2 createProxyObj(){    //lookup create a proxyObj with using CGLib ,if we not use proxyMode in prototype scope
//        return null;
//    }
//    public Mbean2 getMyBean2() {
//        return createProxyObj();
//    }
}