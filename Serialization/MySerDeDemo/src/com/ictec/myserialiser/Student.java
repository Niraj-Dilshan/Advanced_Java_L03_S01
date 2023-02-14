package com.ictec.myserialiser;

import java.io.Serializable;
public class Student implements Serializable {
    private static final long serialVersionUID = 29L;
    private int id;
    private String name;

    //adding a new field
    private double weight;

    private static double age; //Statics are not getting serialized

    private transient long password; //Transients are not getting serialized

    //private Address add = new Address();
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getAge() {
        return age;
    }

    public static void setAge(double age) {
        Student.age = age;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }
}