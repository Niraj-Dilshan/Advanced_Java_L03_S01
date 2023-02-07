package com.ictech.dpatterns;

public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape circle = sf.getShape("Circle");
        circle.draw();
    }
}
