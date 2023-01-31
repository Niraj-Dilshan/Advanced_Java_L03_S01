package com.ictec.dpatterns;

import java.util.Observable;
import java.util.Scanner;

public class AdminLMS extends Observable {
    String lmsmassage;
    Scanner input = new Scanner(System.in);

    public void sendMassage(){
        System.out.println("Please Enter A Massage To Send");
        lmsmassage = input.nextLine();

        setChanged();
        notifyObservers();
    }


}
