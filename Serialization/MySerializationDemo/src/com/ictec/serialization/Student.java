package com.ictec.serialization;

import java.io.Serializable;

public class Student implements Serializable {

    private int id;
    private String name;

    private static double age;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        Student.age = age;
    }
}
