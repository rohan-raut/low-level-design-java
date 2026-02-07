package org.FactoryDesignPattern;

public class VehicleFactory {

    public static IVehicle createVehicle(VehicleType vehicleType){
        if(vehicleType.equals(VehicleType.BUS)){
            return new Bus();
        }
        else if(vehicleType.equals(VehicleType.BIKE)){
            return new Bike();
        }
        else if(vehicleType.equals(VehicleType.TRUCK)){
            return new Truck();
        }

        return null;
    }
}

/*

If the if-else ladder becomes too big in createVehicle method then we can create different concrete factory classes like TruckFactory, CarFactory
ShipFactory, etc.
And IFactory will be the interface for all the concrete factory classes with methods of CreateVehicle which will be implemented by them.
If the client wants Truck, IFactory vehicle = TruckFactory.CreateVehicle();
This may start converting to Abstract Factory Design Pattern.

 */
