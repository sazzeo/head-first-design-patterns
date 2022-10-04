package org.example.pattern.factory.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    protected void prepare() {
        System.out.println("준비중");
        System.out.println("토핑 뿌리기");
        for(String topping : toppings ) {
            System.out.println(" +" +topping);
        }
    }
    protected void bake() {
        System.out.println("굽기");
    }
    protected void cut() {
        System.out.println("자르기");
    }
    protected void box() {
        System.out.println("포장하기");
    }

    public String getName() {
        return name;
    }
}
