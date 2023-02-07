package com.ictec.dpatterns;

public class MyEasyObserverDemo {
    public static void main(String[] args) {
        AdminLMS tecAdmim = new AdminLMS();

        Student Niraj = new Student("Niraj");
        Student Dilshan = new Student("Dilshan");

        tecAdmim.addObserver(Niraj);
        tecAdmim.addObserver(Dilshan);

        tecAdmim.sendMassage();

    }
}
