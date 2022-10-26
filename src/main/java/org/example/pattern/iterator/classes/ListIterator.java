package org.example.pattern.iterator.classes;

import org.example.pattern.iterator.interfaces.Iterator;

import java.util.List;

public class ListIterator implements Iterator {

    private List<MenuItem> menuItems;

    private int position =-1;

    public ListIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.size() > position+1;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(++position);
    }

}
