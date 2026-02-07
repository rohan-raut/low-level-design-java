package org.AbstractFactoryDesignPattern.Button;

public class WindowsButton implements IButton{
    @Override
    public void onPress() {
        System.out.println("Windows button pressed.");
    }
}
