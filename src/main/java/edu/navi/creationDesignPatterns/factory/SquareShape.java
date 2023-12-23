package edu.navi.creationDesignPatterns.factory;

public class SquareShape implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
