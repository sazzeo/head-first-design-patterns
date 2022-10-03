package org.example.pattern.decorator.classes;

import org.example.pattern.decorator.interfaces.Beverage;

//데코레이터의 슈퍼클래스 상속
public class Espresso extends Beverage {

    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
