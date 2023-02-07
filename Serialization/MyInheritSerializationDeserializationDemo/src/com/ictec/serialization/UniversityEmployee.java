package com.ictec.serialization;

import java.io.Serializable;

public class UniversityEmployee extends Employee implements Serializable {
    private int uid;

    public UniversityEmployee(String name, int uid) {
        super(name);
        this.uid = uid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "UniversityEmployee{" +
                "UID=" + uid +
                "Name=" + getName() +
                '}';
    }
}
