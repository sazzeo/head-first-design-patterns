package org.example.pattern.adapter.classes;

import org.example.pattern.adapter.interfaces.Turkey;

public class WildTurkey implements Turkey {


    @Override
    public void gobble() {
        System.out.println("turkey gobble");
    }

    @Override
    public void fly() {
        System.out.println("turkey fly");
    }
}
