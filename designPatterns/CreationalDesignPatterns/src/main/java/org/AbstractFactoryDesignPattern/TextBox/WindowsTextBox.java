package org.AbstractFactoryDesignPattern.TextBox;

public class WindowsTextBox implements ITextBox{
    @Override
    public void display() {
        System.out.println("Windows text box.");
    }
}
