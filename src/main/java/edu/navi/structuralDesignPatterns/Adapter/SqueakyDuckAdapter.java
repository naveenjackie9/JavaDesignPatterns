package edu.navi.structuralDesignPatterns.Adapter;

public class SqueakyDuckAdapter implements SqueakyDuck{

    private Bird bird;

    public SqueakyDuckAdapter(Bird bird) {
        this.bird = bird;
    }

    public SqueakyDuckAdapter() {
        //Default constructor
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}
