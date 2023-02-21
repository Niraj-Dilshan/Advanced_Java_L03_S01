package com.ictec.rmi.stu;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface Department extends Remote {

    public ArrayList<Student> getStudents() throws RemoteException;


}
