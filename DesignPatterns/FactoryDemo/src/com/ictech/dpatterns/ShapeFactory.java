package com.ictech.dpatterns;

public class ShapeFactory {
    public Shape getShape(String name){
        if(name.equalsIgnoreCase("Circle")){
            return new Circle();
        } else if (name.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (name.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else {
            return null;
        }
    }
}
