package com.springcorepractice.learning.inversionofcontrol.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MangoShakeUsingAnnotations {

    private String price;

    public MangoShakeUsingAnnotations() {
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MangoShakeUsingAnnotations{" +
                "price='" + price + '\'' +
                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("Inside start() method");
    }

    @PreDestroy
    public void stop(){
        System.out.println("Inside stop() method");
    }
}

