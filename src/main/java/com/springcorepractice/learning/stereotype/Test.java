package com.springcorepractice.learning.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeConfig.xml");
        Student s1 =  context.getBean("stud",Student.class);
        System.out.println(s1);
    }
}
