package org.example.pattern.iterator.classes;

import lombok.ToString;

@ToString
public class MenuItem {

    private String name;
    private int price;


    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
