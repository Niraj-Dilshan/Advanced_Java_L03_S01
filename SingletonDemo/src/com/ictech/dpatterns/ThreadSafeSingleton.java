package com.ictech.dpatterns;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton ts;

    private ThreadSafeSingleton(){

    }

    public static synchronized ThreadSafeSingleton getThreadSafeSingleton(){
        if(ts==null) {
            ts = new ThreadSafeSingleton();
        }
        return ts;
    }
}
