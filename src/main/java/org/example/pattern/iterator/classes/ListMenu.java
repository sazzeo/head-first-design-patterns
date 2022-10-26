package org.example.pattern.iterator.classes;

import org.example.pattern.iterator.interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ListMenu {

    private List<MenuItem> menuItems;


    public ListMenu() {
        this.menuItems = new ArrayList<>();
        addItem("파스타" , 10000);
        addItem("뇨끼" , 20000);
        addItem("스테이크" , 30000);
    }


    public void addItem(String name, int price) {
        MenuItem menuItem = new MenuItem(name, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }


    public Iterator createIterator() {
        return new ListIterator(menuItems);
    }
}
