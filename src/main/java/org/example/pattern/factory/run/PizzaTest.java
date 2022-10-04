package org.example.pattern.factory.run;

import org.example.pattern.factory.classes.NYStyleCheesePizza;
import org.example.pattern.factory.classes.NYStylePizzaStore;
import org.example.pattern.factory.interfaces.Pizza;
import org.example.pattern.factory.interfaces.PizzaStore;

public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("에단이 주문한" + pizza.getName() );

    }
}
