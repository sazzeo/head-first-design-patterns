package org.example.pattern.templatemethod.classes;

public class Coffee extends Beverage{
    @Override
    void brew() {
        System.out.println("커피 우려내기");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕 추가하기");
    }
}
