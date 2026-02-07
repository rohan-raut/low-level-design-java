package org.Iterator;

import java.util.List;

public class ListCollection<T> implements IIterableCollection<T>{
    public List<T> list;

    public ListCollection(List<T> givenList){
        list = givenList;
    }

    @Override
    public IIterator<T> createIterator() {
        return new ListIterator<T>(list);
    }
}
