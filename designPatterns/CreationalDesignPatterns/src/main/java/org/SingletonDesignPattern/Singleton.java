package org.SingletonDesignPattern;

public class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    System.out.println("Creating new instance");
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
