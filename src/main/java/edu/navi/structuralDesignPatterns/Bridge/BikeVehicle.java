package edu.navi.structuralDesignPatterns.Bridge;

import java.util.List;

public class BikeVehicle extends Vehicle{
    public BikeVehicle(List<Workshop> workshopList) {
        super(workshopList);
    }

    @Override
    public void manufacture() {
        workshopList.stream().forEach(workShop -> {
            workShop.work();
        });
    }
}
