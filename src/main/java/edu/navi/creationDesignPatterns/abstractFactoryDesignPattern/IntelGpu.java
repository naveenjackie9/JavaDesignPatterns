package edu.navi.creationDesignPatterns.abstractFactoryDesignPattern;

public class IntelGpu implements Gpu{

    @Override
    public void buildGpu() {
        System.out.println("INTEL GPU");
    }
}
