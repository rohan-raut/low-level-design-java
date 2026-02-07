package org.FactoryDesignPattern;

public class Bus implements IVehicle{
    @Override
    public void deliver() {
        System.out.println("Deliver by Bus");
    }
}
