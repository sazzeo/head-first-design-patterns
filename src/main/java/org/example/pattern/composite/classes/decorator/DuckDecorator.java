package org.example.pattern.composite.classes.decorator;

import org.example.pattern.composite.interfaces.Quackable;

public class DuckDecorator implements Quackable {

    private Quackable quackable;

    //static 변수 초기화 안하면 자동 0으로 초기화됨
    private static int numberOfQuacks; //운 횟수 저장하기

    public DuckDecorator(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }
}
