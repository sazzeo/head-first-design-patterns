package org.example.pattern.strategy.classes;

import org.example.pattern.strategy.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("(조용...)");
    }
}
