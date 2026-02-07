package org.Iterator;

public interface IIterableCollection<T> {
    IIterator<T> createIterator();
}
