package com.ictec.rmi.cal;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {

    //Add two integers
    public int addTwoIntegers(int x, int y) throws RemoteException;

    //Minus to integers
    public int minusTwoIntegers(int x, int y) throws RemoteException;


}
