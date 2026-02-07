package org.SingletonDesignPattern;

public class Client {

    public static void main(String[] args){

        Thread th1 = new Thread(() -> {
            Singleton obj = Singleton.getInstance();
        });

        Thread th2 = new Thread(() -> {
            Singleton obj = Singleton.getInstance();
        });

        th1.start();
        th2.start();
    }
}

/*
 * Singleton Pattern is used when we just want single instance of object throughout the application. Eg. Logger, DBConnection
 *
 * Reference: https://refactoring.guru/design-patterns/singleton/csharp/example
 *
 */
