package org.example.pattern.factory.interfaces;

import org.example.pattern.factory.classes.SimplePizzaFactory;
import org.example.pattern.factory.interfaces.Pizza;


//factory에서 물건을 뽑아내는 클래스
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String pizza);

}
