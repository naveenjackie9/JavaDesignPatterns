package edu.navi.structuralDesignPatterns.Bridge;

public class ProduceWorkShop implements Workshop{
    @Override
    public void work() {
        System.out.println("Produce workshop");
    }
}
