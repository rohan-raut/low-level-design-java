package org.PrototypeDesignPattern;

public class Client {

    public static void main(String[] args){
        ClassC obj = new ClassC("Rohan", 10, 89.80f);
        System.out.println(obj.toString());

        ClassC cloneObj = obj.clone();
        cloneObj.name = "Swapnil";
        System.out.println(cloneObj.toString());
    }
}

/*
 * Prototype Design pattern is used when you want a copy of the objects to manipulate or need to store some set of configuration which are required
 * frequently so that we can just clone them and use it.
 *
 * During Cloning we need to understand how we want to copy an object, Shallow copying or Deep copying.
 * In Shallow copying, we just copy the reference to the main object.
 * In Deep copying, we actually create new object using 'new' keyword and then copy data inside that.
 *
 * Which copying method should be used totally depends on the users usecase.
 *
 * Another Example: https://refactoring.guru/design-patterns/prototype/csharp/example
 *
 */
