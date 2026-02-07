package org.Iterator;

import java.util.*;

public class Client {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(3);

        ListCollection<Integer> collection = new ListCollection<>(list);
        IIterator<Integer> it = collection.createIterator();

        while(it.hasNext()){
            System.out.println(it.getNext());
        }
    }
}

/*
 *
 * Reference video: https://www.youtube.com/watch?v=X7shKHOaYtU
 *
 * Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation
 * (list, stack, tree, etc.).
 *
 * ListIterator follows composition and when the collection is destroyed the Iterator should also get destroyed.
 *
 */
