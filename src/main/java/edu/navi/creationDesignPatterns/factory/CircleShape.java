package edu.navi.creationDesignPatterns.factory;

public class CircleShape implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
