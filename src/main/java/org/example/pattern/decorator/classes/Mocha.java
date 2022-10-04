package org.example.pattern.decorator.classes;

import org.example.pattern.decorator.interfaces.Beverage;
import org.example.pattern.decorator.interfaces.CondimentDecorator;


//데코레이터가 추가된 beverage 클래스
public class Mocha extends CondimentDecorator {


    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        if (beverage.getSize() == Size.TALL) {   //enum은 == 비교가능
            cost += 0.1;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.2;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.3;
        }
        return cost;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + " +모카 추가";
    }
}
