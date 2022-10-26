package org.example.pattern.iterator.classes;

import org.example.pattern.iterator.interfaces.Iterator;

public class ArrayIterator implements Iterator {

    MenuItem[] items;
    int position = -1;

    public ArrayIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {

        return items[position+1] != null;
    }

    @Override
    public MenuItem next() {
        return items[++position];
    }

}
