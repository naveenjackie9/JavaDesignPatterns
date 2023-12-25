package edu.navi.structuralDesignPatterns.Bridge;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    List<Workshop> workshopList = new ArrayList<>();

    public Vehicle(List<Workshop> workshopList) {
        this.workshopList = workshopList;
    }

    public abstract void manufacture();
}
