package edu.navi.creationDesignPatterns.abstractFactoryDesignPattern;

public class ArmComputerFactory implements ComputerFactory{
    @Override
    public void build() {
        new ArmCpu().buildCpu();
        new ArmGpu().buildGpu();
    }
}