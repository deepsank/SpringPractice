package com.springjdbclearning;

import com.springjdbclearning.dao.StudentDao;
import com.springjdbclearning.dao.impl.StudentDaoImpl;
import com.springjdbclearning.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "The program started......" );
//        spring jdbc => jdbcTemplate

//        FileSystemXmlApplicationContext -- use this if you want to specify the path from the file system
//        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/springjdbclearning/springJdbcConfig.xml");

//        ClassPathXmlApplicationContext --- requires the files to be in classpath, otherwise it is not able to find the file ---- so put it in src/main/resources as this is in classpath
//        ApplicationContext context = new ClassPathXmlApplicationContext("springJdbcConfig.xml");
        /* Using JavaConfig and not xml config */
        ApplicationContext context = new AnnotationConfigApplicationContext(JDBCJavaConfig.class);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        /* Performing CREATE */
//        Student s1 = new Student();
//        s1.setId(7);
//        s1.setName("Black Panthe-T’Challa");
//        s1.setCity("Wakanda");
//
//        int result = studentDao.insert(s1);
//
//        System.out.println("Students added:--- "+ result);


        /* Performing UPDATE */
//        Student s2 = new Student();
//        s2.setId(63);
//        s2.setCity("Pune");
//        s2.setName("Deepak Upadhyay");
//
//        int result = studentDao.update(s2);
////
//        System.out.println("Students updates:--- "+ result);


        /* Performing DELETE */
//        int result = studentDao.delete(7);
//        System.out.println("Deleted:- "+result);


        /*  Performing READ ---- Single Row data */
//        Student s2 = studentDao.getStudent(7);
//        System.out.println(s2);

        /*  Performing READ ---- Multiple Row data */
       List<Student> students = studentDao.getAllStudents();
//        System.out.println(students.toString());
        for(Student student: students){
            System.out.println(student);
        }
    }

}
