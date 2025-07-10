package com.springcorepractice.learning.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("standaloneCollectionConfig.xml");
        Human h1 = context.getBean("human1", Human.class);

        System.out.println(h1);
        System.out.println(h1.getFriends().getClass());
        System.out.println("#########################################################################");
        System.out.println(h1.getFeeStructure().getClass());
        System.out.println("#########################################################################");
        System.out.println(h1.getProperties().getClass());

    }
}
