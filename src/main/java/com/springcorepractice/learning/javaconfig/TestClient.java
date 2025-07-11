package com.springcorepractice.learning.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

//        Car c1 = context.getBean("getCar", Car.class); //defaul bean name same as method in JavaConfig class
        Car c1 = context.getBean("mercedes", Car.class);  // changed default name of bean in JavaConfig class
        System.out.println(c1);
        c1.driving();
    }
}
