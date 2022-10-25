package org.example.pattern.adapter.classes;

import org.example.pattern.adapter.interfaces.Duck;

public class MallardDuck implements Duck {


    @Override
    public void quack() {
        System.out.println("duck quack");
    }

    @Override
    public void fly() {
        System.out.println("duck fly");
    }
}
