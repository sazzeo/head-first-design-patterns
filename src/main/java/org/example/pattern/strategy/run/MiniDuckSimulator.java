package org.example.pattern.strategy.run;

import org.example.pattern.strategy.classes.MallardDuck;
import org.example.pattern.strategy.interfaces.Duck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();;
    }
}
