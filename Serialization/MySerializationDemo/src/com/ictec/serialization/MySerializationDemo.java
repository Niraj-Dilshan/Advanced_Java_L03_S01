package com.ictec.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySerializationDemo {
    public static void main(String[] args) {
        Student stu = new Student(1,"Niraj");
        stu.setAge(24);
        String filePath = "stu.ser";
        // Write object to file
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(stu);
            oos.close();
            fos.close();
            System.out.println("Object written to file successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred while writing object to file.");
            e.printStackTrace();
        }
    }

}
