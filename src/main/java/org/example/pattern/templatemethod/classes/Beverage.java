package org.example.pattern.templatemethod.classes;

public abstract class Beverage {


    
    
    //메소드 추상화하기
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이기");
    }

    void pourInCup(){
        System.out.println("컵에 따르는 중");
    }
}
