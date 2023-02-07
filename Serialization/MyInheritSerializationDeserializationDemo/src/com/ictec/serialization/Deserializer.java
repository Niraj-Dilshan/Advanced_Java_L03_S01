package com.ictec.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserializer {
    FileInputStream fis;
    ObjectInputStream ois;
    public void DeserializerCat(){
        String filePath = "Cat.ser";
        // Read object from file
        try {
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            Cat cat = (Cat) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Object read from file successfully: ");
            System.out.println(cat.toString());
        } catch (Exception e) {
            System.out.println("An error occurred while reading object from file.");
            e.printStackTrace();
        }
    }

    public void DeserializerUniversityEmployee(){
        String filePath = "universityemployee.ser";
        // Read object from file
        try {
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            UniversityEmployee ue = (UniversityEmployee) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Object read from file successfully: ");
            System.out.println(ue.toString());
        } catch (Exception e) {
            System.out.println("An error occurred while reading object from file.");
            e.printStackTrace();
        }
    }
}
