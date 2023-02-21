package com.ictec.rmi.servers;

import com.ictec.rmi.stu.Department;
import com.ictec.rmi.stu.DepartmentStudent;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class FoTServer {
    public static void main(String[] args) {
        try {
            Department depStu = new DepartmentStudent();
            Registry reg = LocateRegistry.createRegistry(54321);
            reg.rebind("ICT_Students",depStu);
            System.out.println("FoT Server Is Running");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
