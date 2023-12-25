package edu.navi.structuralDesignPatterns.Adapter;

public class Sparrow implements Bird{

    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    public void makeSound() {
        System.out.println("ki ki ki");
    }
}
