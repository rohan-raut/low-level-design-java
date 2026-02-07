package org.BuilderDesignPattern;

public class HouseBuilder {
    public String foundation;
    public String structure;
    public String roof;
    public boolean hasGarage;
    public boolean hasSwimmingPool;
    public boolean hasGarden;

    //Builder Constructor with mandatory parameters
    public HouseBuilder(String foundation,String structure,String roof){
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
    }

    //Optional Parameters
    public HouseBuilder setGarden(boolean hasGarden){
        this.hasGarden = hasGarden;
        return this;
    }
    public HouseBuilder setSwimmingPool(boolean hasSwimmingPool){
        this.hasSwimmingPool = hasSwimmingPool;
        return this;
    }
    public HouseBuilder setGarage(boolean hasGarage){
        this.hasGarage = hasGarage;
        return this;
    }
    public House build(){
        return new House(this);
    }
}
