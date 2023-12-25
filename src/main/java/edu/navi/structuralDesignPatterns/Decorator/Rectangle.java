package edu.navi.structuralDesignPatterns.Decorator;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}
