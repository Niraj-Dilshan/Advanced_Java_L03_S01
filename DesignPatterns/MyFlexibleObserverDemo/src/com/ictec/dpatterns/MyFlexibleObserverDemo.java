package com.ictec.dpatterns;

public class MyFlexibleObserverDemo {
    public static void main(String[] args) {

        TecAdmin uthpala = new TecAdmin();

        Student niraj = new Student("niraj");

        Student dilshan = new Student("dilshan");

        uthpala.registerObserver(niraj);

        uthpala.registerObserver(dilshan);

        //uthpala.removeObserver(niraj);

        uthpala.sendMassage();

    }
}
