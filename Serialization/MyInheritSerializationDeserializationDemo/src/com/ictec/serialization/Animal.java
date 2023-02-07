package com.ictec.serialization;

import java.io.Serializable;

public class Animal implements Serializable {
    private double speed;

    public Animal(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
