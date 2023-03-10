package com.ictec.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyDeserializationDemo {
    public static void main(String[] args) {
        String filePath = "stu.ser";
        // Read object from file
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student student = (Student) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Object read from file successfully: ");
            System.out.println("ID       : " + student.getId());
            System.out.println("Name     : " + student.getName());
            System.out.println("Age      : " + student.getAge());
            System.out.println("Password : " + student.getPassword());
        } catch (Exception e) {
            System.out.println("An error occurred while reading object from file.");
            e.printStackTrace();
        }

    }
}
