package org.PrototypeDesignPattern;

public class ClassA implements Cloneable {
    public int value;

    public ClassA(int value){
        this.value = value;
    }

    @Override
    public ClassA clone() {
        return new ClassA(value);
    }
}
