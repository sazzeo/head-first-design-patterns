package org.example.pattern.strategy.classes;


import org.example.pattern.strategy.interfaces.Duck;

//청둥오리 클래스
public class MallardDuck extends Duck {

    public MallardDuck() {
        super();
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("예쁜 청둥오리");
    }
}
