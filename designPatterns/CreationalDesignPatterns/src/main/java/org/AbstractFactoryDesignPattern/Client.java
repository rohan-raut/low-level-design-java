package org.AbstractFactoryDesignPattern;

import org.AbstractFactoryDesignPattern.Button.IButton;
import org.AbstractFactoryDesignPattern.Factory.IFactory;
import org.AbstractFactoryDesignPattern.TextBox.ITextBox;

import java.util.Scanner;

public class Client {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the OS type: ");
        String osType = scanner.nextLine();

        IFactory factory = GUIAbstractFactory.createFactory(osType);
        IButton button = factory.createButton();
        button.onPress();

        ITextBox textBox = factory.createTextBox();
        textBox.display();
    }
}

/*
People start with Factory Design pattern then start shifting to Abstract Factory as products increases.
Abstract Factory is used when we have a family of products which should match the same theme.
 */
