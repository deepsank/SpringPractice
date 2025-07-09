package com.springcorepractice.learning.inversionofcontrol.dependencyinjection.constructoreinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ciconfig.xml");
        Person p = (Person) context.getBean("person");
        System.out.println(p);

        AmbiguityInConstructorInjection ambiguity = (AmbiguityInConstructorInjection) context.getBean("ambiguity");
        System.out.println(ambiguity);
    }
}
