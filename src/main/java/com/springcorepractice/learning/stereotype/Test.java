package com.springcorepractice.learning.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeConfig.xml");
//        Student s1 =  context.getBean("stud",Student.class);
//        System.out.println(s1);
//        System.out.println(s1.getAddresses());
//        System.out.println(s1.getAddresses().getClass().getName());
//
//        System.out.println(s1.hashCode());
//
//        Student s2 = context.getBean("stud",Student.class);
//        System.out.println(s2.hashCode());

        // By Default--- scope is singleton ---- Once created and then for subsequent getBean, gives same object

        // Prototype scope-- everytime new object is created

        Teacher t1 =  context.getBean("teacher",Teacher.class);
        System.out.println(t1.hashCode());

        Teacher t2 = context.getBean("teacher",Teacher.class);
        System.out.println(t2.hashCode());


    }
}
