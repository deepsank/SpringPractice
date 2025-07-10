package com.springcorepractice.learning.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringAnnotationsConfig.xml");
//        Vendor v1 = (Vendor) context.getBean("vendor1");
        Vendor v1 = context.getBean("vendor1", Vendor.class);
        System.out.println(v1);
    }
}
