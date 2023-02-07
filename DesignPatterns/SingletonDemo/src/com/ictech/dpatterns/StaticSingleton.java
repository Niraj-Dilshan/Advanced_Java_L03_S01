package com.ictech.dpatterns;

public class StaticSingleton {
    private static StaticSingleton ss;

    private StaticSingleton(){

    }

    static {

        try {

            ss = new StaticSingleton();

        }catch (Exception e){

            throw new RuntimeException("Object Creation Exception");

        }


    }

    public static StaticSingleton getStaticSingleton(){

        return ss;
    }
}
