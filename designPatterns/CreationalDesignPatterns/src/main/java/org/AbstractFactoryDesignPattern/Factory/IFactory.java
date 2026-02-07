package org.AbstractFactoryDesignPattern.Factory;

import org.AbstractFactoryDesignPattern.Button.IButton;
import org.AbstractFactoryDesignPattern.TextBox.ITextBox;

public interface IFactory {
    IButton createButton();
    ITextBox createTextBox();
}
