package edu.navi.structuralDesignPatterns.Adapter;

public class PlasticSqueakyDuck implements SqueakyDuck{
    @Override
    public void squeak() {
        System.out.println("Plastic duck Squeak");
    }
}
