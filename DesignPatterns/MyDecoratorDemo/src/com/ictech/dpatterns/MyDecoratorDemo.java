package com.ictech.dpatterns;

public class MyDecoratorDemo {
    public static void main(String[] args) {
        Computer com = new Computer();
        System.out.println(com.description());

        com = new ComDVD(com);
        System.out.println(com.description());

        com = new ComMonitor(com);
        System.out.println(com.description());

    }
}
