package org.PrototypeDesignPattern;

public class ClassC extends ClassB implements Cloneable{
    public String name;

    public ClassC(String name, int value, float score){
        super(value, score);
        this.name = name;
    }


    @Override
    public ClassC clone() {
        return new ClassC(name, value, score);
    }

    @Override
    public String toString(){
        return "Name=" + name + " value=" + value + " score=" + score;
    }
}
