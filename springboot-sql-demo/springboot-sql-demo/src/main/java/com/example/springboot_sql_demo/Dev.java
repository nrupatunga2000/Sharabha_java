package com.example.springboot_sql_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//this will tell springboot to create a bean for this class
@Component
public class Dev {
    @Autowired //this is called as field injection
    private Laptop laptop;
    

    public void build(){
        laptop.compile();
        System.out.println("the first code using bean");
    }
}
