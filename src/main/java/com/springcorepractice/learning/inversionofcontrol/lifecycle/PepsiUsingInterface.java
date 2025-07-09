package com.springcorepractice.learning.inversionofcontrol.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PepsiUsingInterface implements InitializingBean, DisposableBean {

    private double pepsi;

    public PepsiUsingInterface(){

    }

    public double getPepsi() {
        return pepsi;
    }

    public void setPepsi(double pepsi) {
        this.pepsi = pepsi;
    }

    @Override
    public String toString() {
        return "PepsiUsingInterface{" +
                "pepsi=" + pepsi +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {             // Comes from InitializingBean
        System.out.println("Started drinking Pepsi---- init");
    }

    @Override
    public void destroy() throws Exception {                        // Comes from DisposableBean
        System.out.println("Finished drinking Pepsi---- destroy");
    }
}
