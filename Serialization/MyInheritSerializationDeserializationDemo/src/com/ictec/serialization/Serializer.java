package com.ictec.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {
    FileOutputStream fos;
    ObjectOutputStream oos;

    public void SerializerCat(Cat c){
        String filePath = "Cat.ser";
        // Write object to file
        try {
            fos = new FileOutputStream(filePath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(c);
            oos.flush();
            oos.close();
            fos.close();
            System.out.println("Object written to file successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred while writing object to file.");
            e.printStackTrace();
        }
    }

    public void SerializerUniversityEmployee(UniversityEmployee ue){
        String filePath = "universityemployee.ser";
        // Write object to file
        try {
            fos = new FileOutputStream(filePath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(ue);
            oos.flush();
            oos.close();
            fos.close();
            System.out.println("Object written to file successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred while writing object to file.");
            e.printStackTrace();
        }
    }
}
