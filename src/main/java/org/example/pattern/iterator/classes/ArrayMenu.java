package org.example.pattern.iterator.classes;

import org.example.pattern.iterator.interfaces.Iterator;

public class ArrayMenu {

    private ArrayMenu[] menus;

    public Iterator createIterator() {
        return new ArrayIterator();
    }
}
