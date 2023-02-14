package com.ictec.mydeserialiser;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import com.ictec.myserialiser.Student;

public class MyDeserializationDemo {
    public static void main(String[] args) {

        try{
            FileInputStream fis = new FileInputStream("stu.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student stu = (Student)ois.readObject();
            System.out.println("Id : " + stu.getId());
            System.out.println("Name : " + stu.getName());

            System.out.println("Age : "+ Student.getAge());//static field

            System.out.println("Password : " + stu.getPassword());//transient field

            fis.close();
            ois.close();

        }catch (Exception e){
            System.out.println("Exception Occured : " + e.getMessage());
        }
    }
}
