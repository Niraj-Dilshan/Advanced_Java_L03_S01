package com.ictec.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
                "UID = '" + uid +"'"+
                " Name = '" + getName()+"'" +
                '}';
    }

    private void writeObject(ObjectOutputStream ous) throws IOException {
        ous.defaultWriteObject();
        ous.writeObject(getName());//string is an object
    }

    private void readObject(ObjectInputStream ois) throws IOException,ClassNotFoundException{
        ois.defaultReadObject();
        setName((String) ois.readObject());
    }
}
