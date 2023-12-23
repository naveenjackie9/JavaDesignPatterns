package edu.navi.creationDesignPatterns.abstractFactoryDesignPattern;

public class IntelCpu implements Cpu{

    @Override
    public void buildCpu() {
        System.out.println("INTEL CPU");
    }
}
