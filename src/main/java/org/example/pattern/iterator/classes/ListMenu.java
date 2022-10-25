package org.example.pattern.iterator.classes;

import org.example.pattern.iterator.interfaces.Iterator;

import java.util.List;

public class ListMenu {

    private List<MenuItem> menus;

    public Iterator createIterator() {
        return new ListIterator();
    }
}
