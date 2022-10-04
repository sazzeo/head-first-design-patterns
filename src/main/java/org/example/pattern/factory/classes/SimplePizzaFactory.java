package org.example.pattern.factory.classes;

import org.example.pattern.factory.interfaces.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese" :
                pizza = new CheesePizza();
            case "pepperoni" :
                pizza = new PepperoniPizza();
        }

        return pizza;
    }

}
