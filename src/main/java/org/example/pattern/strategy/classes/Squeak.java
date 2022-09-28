package org.example.pattern.strategy.classes;

import org.example.pattern.strategy.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("삑삑");
    }
}
