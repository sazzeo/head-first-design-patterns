package org.example.pattern.strategy.classes;

import org.example.pattern.strategy.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly no way");
    }
}
