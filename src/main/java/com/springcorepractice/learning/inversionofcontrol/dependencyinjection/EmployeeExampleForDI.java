package com.springcorepractice.learning.inversionofcontrol.dependencyinjection;

/*
* Setter Injection --- --p-namespace || value as an element || value as an attribute
*
*
* */
public class EmployeeExampleForDI {
    private int employeeId;
    private String employeeName;
    private int age;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        System.out.println("---Setting Employee Id---");
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        System.out.println("---Setting Employee Name---");
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("---Setting Employee Age---");
        this.age = age;
    }

    public EmployeeExampleForDI() {
    }

    public EmployeeExampleForDI(int employeeId, String employeeName, int age) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SetterInjection{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", age=" + age +
                '}';
    }
}
