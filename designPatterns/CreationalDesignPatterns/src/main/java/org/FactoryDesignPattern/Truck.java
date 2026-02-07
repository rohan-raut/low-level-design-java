package org.FactoryDesignPattern;

public class Truck implements IVehicle{

    @Override
    public void deliver() {
        System.out.println("Deliver by Truck");
    }

}
