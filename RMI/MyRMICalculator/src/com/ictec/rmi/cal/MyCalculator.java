package com.ictec.rmi.cal;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyCalculator extends UnicastRemoteObject implements Calculator{

    public MyCalculator() throws RemoteException {
        super();
    }

    @Override
    public int addTwoIntegers(int x, int y) throws RemoteException {
        return x+y;
    }

    @Override
    public int minusTwoIntegers(int x, int y) throws RemoteException {
        return x-y;
    }

}
