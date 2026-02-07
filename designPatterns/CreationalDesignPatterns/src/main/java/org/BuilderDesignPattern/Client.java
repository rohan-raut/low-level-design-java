package org.BuilderDesignPattern;

public class Client {

    public static void main(String[] args){
        House house = new HouseBuilder("Concrete", "Wooden", "Tile")
                .setGarden(true)
                .setSwimmingPool(true)
                .setGarage(false)
                .build();

        System.out.println(house);
    }
}

/*
 * When there is complex object creation, like we have too many optional configuration take user can specify then we need to overload the constructors
 * and create 2^n constructors where n is the number of parameters. That time we use Builder pattern.
 *
 * In builder pattern, Director has the Builder and builder has the product. Directors knows all the sequenctail steps to follow to build the end product.
 * For Custom configuration like we did when building the Custom product, director is not required, we can directly can the builder methods, we can
 * also follow the chaining here.
 *
 * Eg of chaining: https://github.com/prateek27/design-patterns-java/tree/main/design-patterns/src/main/java/org/prateek/CreationalPatterns/BuilderPattern
 */
