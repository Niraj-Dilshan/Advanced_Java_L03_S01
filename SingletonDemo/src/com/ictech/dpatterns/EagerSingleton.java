package com.ictech.dpatterns;

public class EagerSingleton {
    private static EagerSingleton es = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getEagerSingleton(){
        return es;
    }
}
