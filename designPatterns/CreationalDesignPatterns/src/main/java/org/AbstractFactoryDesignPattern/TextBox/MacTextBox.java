package org.AbstractFactoryDesignPattern.TextBox;

public class MacTextBox implements ITextBox{
    @Override
    public void display() {
        System.out.println("Mac text box.");
    }
}
