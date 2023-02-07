package com.ictec.dpatterns;

import java.util.ArrayList;
import java.util.Scanner;

public class TecAdmin implements MySubject{

    private ArrayList<MyObserver> students = new ArrayList<>();
    //private MyObserver student;
    private String msg;
    private Scanner input = new Scanner(System.in);
    @Override
    public void registerObserver(MyObserver obj) {
        students.add(obj);
    }

    @Override
    public void removeObserver(MyObserver obj) {
        students.remove(obj);
    }

    @Override
    public void notifyObserver() {
        //student.update(msg);
        for (MyObserver student:students) {
            student.update(msg);
        }
    }

    @Override
    public void sendMassage(){
        System.out.print("Enter the Massage : ");
        msg = input.nextLine();
        notifyObserver();
    }
}
