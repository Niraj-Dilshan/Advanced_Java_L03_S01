package com.ictech.dpatterns;

public class SingletonDemo {
    public static void main(String[] args) {

        System.out.println(EagerSingleton.getEagerSingleton());
        System.out.println(LazySingleton.getLazySingleton());
        System.out.println(StaticSingleton.getStaticSingleton());
        System.out.println(ThreadSafeSingleton.getThreadSafeSingleton());
        System.out.println(BillPughSingleton.getBillPughSingleton());

    }
}
