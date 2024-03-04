package com.first;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype",proxyMode =ScopedProxyMode.TARGET_CLASS)
public class Mbean2 {
    @Value("atul chaudhary")
    private String name;
    public Mbean2() {
        System.out.println("cons mybean2");
    }
    public String getName() {
        return name;
    }

}
