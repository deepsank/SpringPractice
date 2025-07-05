package com.springcorepractice.learning.inversionofcontrol.dependencyinjection.referencetypeinjection;

public class DependentClass {

    private int Z;

    private BaseClass baseClass;

    public int getZ() {
        return Z;
    }

    public void setZ(int z) {
        Z = z;
    }

    public BaseClass getBaseClass() {
        return baseClass;
    }

    public void setBaseClass(BaseClass baseClass) {
        this.baseClass = baseClass;
    }

    public DependentClass() {

    }

    @Override
    public String toString() {
        return "DependentClass{" +
                "Z=" + Z +
                ", baseClass=" + baseClass +
                '}';
    }
}
