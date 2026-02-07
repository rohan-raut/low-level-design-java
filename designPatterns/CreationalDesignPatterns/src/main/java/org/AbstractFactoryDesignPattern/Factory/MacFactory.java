package org.AbstractFactoryDesignPattern.Factory;

import org.AbstractFactoryDesignPattern.Button.IButton;
import org.AbstractFactoryDesignPattern.Button.MacButton;
import org.AbstractFactoryDesignPattern.TextBox.ITextBox;
import org.AbstractFactoryDesignPattern.TextBox.MacTextBox;

public class MacFactory implements IFactory{
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new MacTextBox();
    }
}
