package edu.navi.creationDesignPatterns.abstractFactoryDesignPattern;

public class ArmGpu implements Gpu{

    @Override
    public void buildGpu() {
        System.out.println("ARM GPU");
    }
}
