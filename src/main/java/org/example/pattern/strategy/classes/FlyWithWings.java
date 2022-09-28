package org.example.pattern.strategy.classes;

import org.example.pattern.strategy.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with wing");
    }

}
