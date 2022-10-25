package org.example.pattern.templatemethod.classes;

public class Tea extends Beverage{
    @Override
    void brew() {
        System.out.println("찻잎 우리기");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬 추가하기");
    }
}
