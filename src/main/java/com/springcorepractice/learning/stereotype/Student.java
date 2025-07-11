package com.springcorepractice.learning.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {
    @Value("Deepak Kumar Upadhyay")
    private String studentName;
    @Value("Chandausi")
    private String city;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
