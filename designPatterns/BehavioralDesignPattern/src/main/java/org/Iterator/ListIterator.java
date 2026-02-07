package org.Iterator;

import java.util.List;

public class ListIterator<T> implements IIterator<T>{
    List<T> list;
    int currPosition = 0;

    public ListIterator(List<T> givenList){
        list = givenList;
    }

    @Override
    public boolean hasNext() {
        if(currPosition < list.size()){
            return true;
        }
        return false;
    }

    @Override
    public T getNext() {
        T element = list.get(currPosition);
        currPosition++;
        return element;
    }
}
