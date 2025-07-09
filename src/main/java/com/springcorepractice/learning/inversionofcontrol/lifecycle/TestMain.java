package com.springcorepractice.learning.inversionofcontrol.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleConfig.xml");
        Samosa samosa = (Samosa) context.getBean("s1");
        System.out.println(samosa);
      /*  ---Regisitering shut down hook method--- */
        context.registerShutdownHook();  // Required to call destroy() method as it doesn't get called automatically without this

        System.out.println("##################################################################");
        /* -----  Configuration of lifecycle methods using Interfaces  -----*/
        PepsiUsingInterface p1 = (PepsiUsingInterface) context.getBean("p1");
        context.registerShutdownHook();
    }
}
