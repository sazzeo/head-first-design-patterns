package org.example.pattern.factory.classes;

import org.example.pattern.factory.interfaces.Pizza;


//뉴욕 스타일 피자
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "뉴욕 스타일 피자";
        dough = "씬 크리스트 도우";
        sauce = "뉴욕 소스";
        toppings.add("레지아노 치즈");
    }

}
