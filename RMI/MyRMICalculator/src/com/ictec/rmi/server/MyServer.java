package com.ictec.rmi.server;

import com.ictec.rmi.cal.Calculator;
import com.ictec.rmi.cal.MyCalculator;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {

        try {

            //1.need to have a registry
            Registry myReg = LocateRegistry.createRegistry(50505);

            //2.bind the object
            Calculator myCal = new MyCalculator();
            myReg.rebind("My_Calculator_Server", myCal);

            //3.to identify server is running
            System.out.println("My Calculator Server Is Running");

        } catch (RemoteException e) {
            System.out.println("RemoteException Creating Registry "+e.getMessage());
        }
    }
}
