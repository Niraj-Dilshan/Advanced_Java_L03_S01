package com.ictec.dpatterns;

public class MyTemplateDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println("");
        game = new Football();
        game.play();
    }
}
