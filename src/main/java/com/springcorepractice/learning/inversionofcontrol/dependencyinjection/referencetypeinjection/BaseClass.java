package com.springcorepractice.learning.inversionofcontrol.dependencyinjection.referencetypeinjection;

public class BaseClass {

    private int X;
    private int Y;

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public BaseClass() {
    }

    @Override
    public String toString() {
        return "BaseClass{" +
                "X='" + X + '\'' +
                ", Y='" + Y + '\'' +
                '}';
    }
}
