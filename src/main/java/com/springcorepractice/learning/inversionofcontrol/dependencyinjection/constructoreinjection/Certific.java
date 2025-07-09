package com.springcorepractice.learning.inversionofcontrol.dependencyinjection.constructoreinjection;

public class Certific {

    public String name;

    public Certific(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Certific{" +
                "name='" + name + '\'' +
                '}';
    }
}
