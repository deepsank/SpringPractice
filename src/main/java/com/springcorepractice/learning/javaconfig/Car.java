package com.springcorepractice.learning.javaconfig;

import org.springframework.stereotype.Component;

//@Component("superCar")   //--- Alernative @Bean annotation is used in JavaConfig class;
public class Car {

    private Samosa samosa;

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public Car(Samosa samosa) {
        this.samosa = samosa;
    }

    public void driving(){
        this.samosa.display();
        System.out.println("Super Car is driven on the highway.");
    }
}
