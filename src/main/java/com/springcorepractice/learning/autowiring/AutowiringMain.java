package com.springcorepractice.learning.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringConfig.xml");
//        Vendor v1 = (Vendor) context.getBean("vendor1");
        Vendor v1 = context.getBean("vendor1",Vendor.class);
        System.out.println(v1);
    }
}
