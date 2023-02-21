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
            myReg.rebind("My Calculator Server", myCal);
        } catch (RemoteException e) {
            System.out.println("RemoteException Creating Registry "+e.getMessage());
        }
    }
}
