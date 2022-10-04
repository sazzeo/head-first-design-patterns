package org.example.pattern.factory.classes;

import org.example.pattern.factory.interfaces.Pizza;
import org.example.pattern.factory.interfaces.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {



    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        switch (type) {
            case "cheese" :
                pizza =  new NYStyleCheesePizza();
        }
        return new NYStyleCheesePizza();
    }
}
