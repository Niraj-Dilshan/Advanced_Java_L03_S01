package com.ictec.myserialiser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySerializationDemo {
    public static void main(String[] args) {
        Student stu = new Student(1,"Niraj");
        Student.setAge(23.5);//static field
        stu.setPassword(23L);

        try{
            FileOutputStream fos = new FileOutputStream("stu.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(stu);
            oos.flush();
            fos.close();
            oos.close();

            System.out.println("Serialization Complete");
        }catch (Exception e){
            System.out.println("Exception Occured : " + e.getMessage());
            e.printStackTrace();
        }


    }
}
