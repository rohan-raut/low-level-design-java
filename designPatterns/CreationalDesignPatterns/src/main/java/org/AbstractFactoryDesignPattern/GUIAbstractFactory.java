package org.AbstractFactoryDesignPattern;

import org.AbstractFactoryDesignPattern.Factory.IFactory;
import org.AbstractFactoryDesignPattern.Factory.MacFactory;
import org.AbstractFactoryDesignPattern.Factory.WindowsFactory;

public class GUIAbstractFactory {
    public static IFactory createFactory(String osType){
        if(osType.equals("Win")){
            return new WindowsFactory();
        }
        else if(osType.equals("Mac")){
            return new MacFactory();
        }

        System.out.println("No such OS type exists.");
        return null;
    }
}
