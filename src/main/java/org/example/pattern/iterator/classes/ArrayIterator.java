package org.example.pattern.iterator.classes;

import org.example.pattern.iterator.interfaces.Iterator;

public class ArrayIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuItem next() {
        return null;
    }
}
