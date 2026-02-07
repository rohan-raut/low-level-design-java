package org.AbstractFactoryDesignPattern.Button;

public class MacButton implements IButton{
    @Override
    public void onPress() {
        System.out.println("Mac button pressed.");
    }
}
