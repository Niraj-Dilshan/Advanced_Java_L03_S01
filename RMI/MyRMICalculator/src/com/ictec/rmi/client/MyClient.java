package com.ictec.rmi.client;

import com.ictec.rmi.cal.Calculator;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
    public static void main(String[] args) {
        try {
            //1. Locate the registry
            Registry myReg = LocateRegistry.getRegistry("localhost",50505);

            //2. Locate Remote Object
            Calculator myCal = (Calculator) myReg.lookup("My_Calculator_Server");

            //3. Method invocation
            int addition = myCal.addTwoIntegers(12,20);
            System.out.println("Addition Of Two Numbers Is          : "+addition);

            int subtraction = myCal.minusTwoIntegers(20,30);
            System.out.println("Subtraction Of Two Numbers Is       : "+ subtraction);

            int multiplication = myCal.multiplyTwoIntegers(5,5);
            System.out.println("Multiplication Of Two Numbers Is    : "+ multiplication);

            double division = myCal.divideTwoIntegers(20,0);
            System.out.println("Division Of Two Numbers Is          : "+ division);

        } catch (RemoteException e) {
            System.out.println("Error Locating Registry In Client "+e.getMessage());
        } catch (NotBoundException e) {
            System.out.println("Remote object not bound "+e.getMessage());
        }
    }
}
