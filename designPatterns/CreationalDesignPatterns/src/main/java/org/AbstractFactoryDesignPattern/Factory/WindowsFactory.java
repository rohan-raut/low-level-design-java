package org.AbstractFactoryDesignPattern.Factory;

import org.AbstractFactoryDesignPattern.Button.IButton;
import org.AbstractFactoryDesignPattern.Button.WindowsButton;
import org.AbstractFactoryDesignPattern.TextBox.ITextBox;
import org.AbstractFactoryDesignPattern.TextBox.WindowsTextBox;

public class WindowsFactory implements IFactory{
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new WindowsTextBox();
    }
}
