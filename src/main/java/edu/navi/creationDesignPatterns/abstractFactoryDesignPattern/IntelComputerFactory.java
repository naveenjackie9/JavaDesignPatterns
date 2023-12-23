package edu.navi.creationDesignPatterns.abstractFactoryDesignPattern;

public class IntelComputerFactory implements ComputerFactory{
    @Override
    public void build() {
        new IntelCpu().buildCpu();
        new IntelGpu().buildGpu();
    }
}
