package org.example.pattern.iterator.classes;

import org.example.pattern.iterator.interfaces.Iterator;

public class ArrayMenu {

    private MenuItem[] menuItems;
    private int menuSize = 0;

    private final int MAX_SIZE = 5;

    public ArrayMenu() {
        this.menuItems = new MenuItem[MAX_SIZE];
        addMenu("감자" , 1000);
        addMenu("고구마" , 2000);
        addMenu("당근" , 3000);
    }


    public void addMenu(String name, int price) {

        if (menuSize  < MAX_SIZE) {
            MenuItem menuItem = new MenuItem(name, price);
            menuItems[menuSize++] = menuItem;
        } else {
            System.out.println("메뉴가 꽉찼습니다.");
        }

    }

    public MenuItem[] getMenus() {
        return menuItems;
    }


    public Iterator createIterator() {
        return new ArrayIterator(menuItems);
    }
}
