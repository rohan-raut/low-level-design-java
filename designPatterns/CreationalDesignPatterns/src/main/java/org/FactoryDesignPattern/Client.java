package org.FactoryDesignPattern;

import java.util.Scanner;

public class Client {

    public static void main(String[] args){

        IVehicle vehicle = VehicleFactory.createVehicle(VehicleType.BIKE);

        if(vehicle != null){
            vehicle.deliver();
        }
    }
}

/*

Factory Method takes care of object creation for client. There is no need for client to write big if-else ladder for different vehicle Types.
The owner of the Vehicle Factory will take care of the creation and adding new vehicles in the library.

If there is a new requirement of new Vehicle type (Car) then there is no need to change the code from client side.

 */