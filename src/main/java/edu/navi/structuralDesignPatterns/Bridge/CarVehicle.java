package edu.navi.structuralDesignPatterns.Bridge;

import java.util.List;

public class CarVehicle extends Vehicle{

    public CarVehicle(List<Workshop> workshopList) {
        super(workshopList);
    }

    @Override
    public void manufacture() {
        workshopList.stream().forEach(workShop -> {
            workShop.work();
        });
    }
}
