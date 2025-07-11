package com.springcorepractice.learning.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcorepractice.learning.javaconfig")  // as @Component is removed from the Car class, so need of this
public class JavaConfig {

    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }
    @Bean(name = {"mercedes","audi","xuv700"})
    public Car getCar(){
        Car car = new Car(getSamosa());
        return car;
    }
}
