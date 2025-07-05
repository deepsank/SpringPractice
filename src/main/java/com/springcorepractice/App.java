package com.springcorepractice;

import com.springcorepractice.learning.Student;
import com.springcorepractice.learning.inversionofcontrol.dependencyinjection.EmployeeExampleForDI;
import com.springcorepractice.learning.inversionofcontrol.dependencyinjection.collections.CollectionsEmployee;
import com.springcorepractice.learning.inversionofcontrol.dependencyinjection.referencetypeinjection.DependentClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //        Student s1 = (Student) context.getBean("student1");
        ApplicationContext context = new ClassPathXmlApplicationContext("dependencyInjection.xml","collectionsConfig.xml","refConfig.xml");
//        EmployeeExampleForDI e1 =(EmployeeExampleForDI)context.getBean("employee1"); // Setter Injection --value as an element
//        System.out.println(e1);
//        EmployeeExampleForDI e2 =(EmployeeExampleForDI)context.getBean("employee2"); // Setter Injection --value as an attribute
//        System.out.println(e2);
//        EmployeeExampleForDI e3 =(EmployeeExampleForDI)context.getBean("employee3"); // Setter Injection --p-namespace
//        System.out.println(e3);

//        CollectionsEmployee c1 =(CollectionsEmployee)context.getBean("emplCollections1");
//        System.out.println(c1.getName());
//        System.out.println(c1.getPhones());
//        System.out.println(c1.getAddresses());
//        System.out.println(c1.getCourses());

        DependentClass dependentClass = (DependentClass) context.getBean("DC1");
        System.out.println(dependentClass);
    }
}
