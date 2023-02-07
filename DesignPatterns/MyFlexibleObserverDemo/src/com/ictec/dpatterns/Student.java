package com.ictec.dpatterns;

public class Student implements MyObserver{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("I'm "+ this.name +" got the massage : " + msg);
    }
}
