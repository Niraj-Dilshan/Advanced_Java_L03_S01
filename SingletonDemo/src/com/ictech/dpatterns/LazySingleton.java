package com.ictech.dpatterns;

public class LazySingleton {
    private static LazySingleton ls;

    private LazySingleton(){

    }

    public static LazySingleton getLazySingleton(){
        if(ls==null) {
            ls = new LazySingleton();
        }
        return ls;
    }
}
