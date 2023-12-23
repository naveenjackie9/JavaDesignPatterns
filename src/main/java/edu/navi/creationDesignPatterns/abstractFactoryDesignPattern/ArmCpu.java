package edu.navi.creationDesignPatterns.abstractFactoryDesignPattern;

public class ArmCpu implements Cpu{

    @Override
    public void buildCpu() {
        System.out.println("ARM CPU");
    }
}
