package com.ictec.rmi.clients;

import com.ictec.rmi.stu.Department;
import com.ictec.rmi.stu.Student;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class UoRStudentAffairs {
    public static void main(String[] args) {
        try {

            Registry reg = LocateRegistry.getRegistry("localhost",54321);
            Department ict = (Department) reg.lookup("ICT_Students");
            ArrayList<Student> Students = ict.getStudents();

            int i = 1;

            for (Student stu:Students) {
                System.out.println("---------------------------------------");
                System.out.println("Details of "+ i +" Student");
                System.out.println("---------------------------------------");
                System.out.println("Student ID      : "+ stu.getId());
                System.out.println("Student Name    : "+ stu.getStu_name());
                System.out.println("Student Address : "+ stu.getStu_address());
                System.out.println("---------------------------------------");
                i++;
            }

        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }

    }
}
