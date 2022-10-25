package org.example.pattern.iterator.classes;

import org.example.pattern.iterator.interfaces.Iterator;

public class ListIterator implements Iterator {


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuItem next() {
        return null;
    }
}
