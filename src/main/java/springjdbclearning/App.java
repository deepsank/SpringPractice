package springjdbclearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("springJdbcConfig.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

        //insert data
        String query = "insert into student(id,name,city) values (?,?,?)";

        //fire query
        int result = template.update(query,04,"Ironman- Tony Stark","New York City");

        System.out.println("Number of records inserted:-- "+result);



    }
}
