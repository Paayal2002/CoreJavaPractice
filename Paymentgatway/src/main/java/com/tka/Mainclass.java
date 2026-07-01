package com.tka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainclass {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);

        Customer c = context.getBean(Customer.class);

        System.out.println(c.getPay1().payment());
        System.out.println(c.getPay2().payment());
        
    }
}