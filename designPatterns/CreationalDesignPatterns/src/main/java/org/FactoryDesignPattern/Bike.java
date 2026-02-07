package org.FactoryDesignPattern;

public class Bike implements IVehicle{
    @Override
    public void deliver() {
        System.out.println("Deliver by Bike");
    }
}
