package edu.navi.structuralDesignPatterns.Bridge;

public class AssembleWorkShop implements Workshop{

    @Override
    public void work() {
        System.out.println("Assemble workshop");
    }
}
