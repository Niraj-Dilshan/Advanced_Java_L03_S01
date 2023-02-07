package com.ictech.dpatterns;

public class Student {

    String name;

    String gender = "male";

    private Student (String name){

        this.gender = gender;

        this.name = name;

        System.out.println("My name is " + this.name + " is " + this.gender);

    }

    public static Student getStudent(String name){
        Student studentout = new Student(name);
        return studentout;
    }
}
