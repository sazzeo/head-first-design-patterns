package org.example.pattern.decorator.run;

import org.example.pattern.decorator.classes.Espresso;
import org.example.pattern.decorator.classes.Mocha;
import org.example.pattern.decorator.classes.Whip;
import org.example.pattern.decorator.interfaces.Beverage;

public class Order {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();  //기본 Beverage 클래스를 만든다.
        beverage.print();

        Mocha mochaCoffee = new Mocha(beverage);
        mochaCoffee.setSize(Beverage.Size.GRANDE);
        mochaCoffee.print();
        Mocha twoMochaCoffee = new Mocha(mochaCoffee);
        twoMochaCoffee.print();

        Whip whip = new Whip(twoMochaCoffee);
        whip.print();
    }
}
