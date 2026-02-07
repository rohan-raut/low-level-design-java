package org.PrototypeDesignPattern;

public class ClassB extends ClassA implements Cloneable{
    public float score;

    public ClassB(int value, float score){
        super(value);
        this.score = score;
    }


    @Override
    public ClassB clone() {
        return new ClassB(value, score);
    }
}
