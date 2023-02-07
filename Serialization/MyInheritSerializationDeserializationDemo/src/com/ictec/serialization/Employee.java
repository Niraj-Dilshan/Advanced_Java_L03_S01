package com.ictec.serialization;

public class Employee {
    private String name;
    private int age;

    public Employee(){}

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
