package com.ictec.threads;

public class NewLaunchEvent implements Runnable{
    private String message;

    public NewLaunchEvent(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}
