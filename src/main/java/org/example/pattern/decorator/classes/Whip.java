package org.example.pattern.decorator.classes;

import org.example.pattern.decorator.interfaces.Beverage;
import org.example.pattern.decorator.interfaces.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .60;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " +휘핑 추가";
    }
}
