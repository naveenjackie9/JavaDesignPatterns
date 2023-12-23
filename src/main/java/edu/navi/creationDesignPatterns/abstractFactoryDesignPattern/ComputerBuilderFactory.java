package edu.navi.creationDesignPatterns.abstractFactoryDesignPattern;

public class ComputerBuilderFactory {
    public ComputerFactory getComputerFactory(String type) {
        switch (type) {
            case "INTEL" :
                return new IntelComputerFactory();
            case "ARM":
                return new ArmComputerFactory();
            default:
                System.out.println("NO FACTORY FOUND");
                return null;
        }
    }
}
