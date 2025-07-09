package com.springcorepractice.learning.inversionofcontrol.dependencyinjection.constructoreinjection;

public class AmbiguityInConstructorInjection {

    private int x;
    private int y;
/*
* Ambiguity if the bean defined in the xml file doesn't define the type attribute for each member variable.
* By default, if no type mentioned then, considered as String(if Constructor with String type arguments present), or
*  otherwise-- the order of constructor appearing in the bean cless considered-- 1st constructor executes
*   If we want to remove this ambiguity and call the constructor which we want , then, we need to add type atttibute in the
* construct-args element tag of the beans.
*
* */
    public AmbiguityInConstructorInjection(int x, int y) {
        System.out.println("Inside:- int int");
        this.x = x;
        this.y = y;
    }

    public AmbiguityInConstructorInjection(double x, double y) {
        System.out.println("Inside:- double double");

        this.x = (int) x;
        this.y = (int) y;
    }

    public AmbiguityInConstructorInjection(String x, String y) {
        System.out.println("Inside:- String String");

        this.x = Integer.parseInt(x);
        this.y = Integer.parseInt(y);
    }

    @Override
    public String toString() {
        return "AmbiguityInConstructorInjection{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
