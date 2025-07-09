package com.springcorepractice.learning.inversionofcontrol.dependencyinjection.constructoreinjection;

public class Person {

    private String name;
    private int personId;
    private Certific certificate;

    public Person() {
    }

    public Person(String name, int personId, Certific certificate) {
        this.name = name;
        this.personId = personId;
        this.certificate = certificate;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certificate=" + certificate +
                '}';
    }
}
