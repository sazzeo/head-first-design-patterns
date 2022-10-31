package org.example.pattern.composite.run;

import org.example.pattern.composite.classes.*;
import org.example.pattern.composite.classes.adapter.GooseAdapter;
import org.example.pattern.composite.classes.decorator.DuckDecorator;
import org.example.pattern.composite.interfaces.Quackable;

public class DuckSimulator {

    public static void main(String[] args) {

        System.out.println("오리 시뮬레이션 게임");

        Quackable duck1 = new Duck1();
        Quackable duck2 = new Duck2();
        Quackable duck3 = new Duck3();
        Quackable duck4 = new Duck4();
        Quackable goose1 = new GooseAdapter(new Goose1());


        //데코레이터 사용하기
       Quackable duck11 = new DuckDecorator(duck1);
        Quackable duck22 = new DuckDecorator(duck2);
        Quackable duck33 = new DuckDecorator(duck3);
        Quackable duck44 = new DuckDecorator(duck4);
        Quackable goose11 = new DuckDecorator(goose1);

        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate(duck11);
        duckSimulator.simulate(duck22);
        duckSimulator.simulate(duck33);
        duckSimulator.simulate(duck44);
        duckSimulator.simulate(goose11); //어댑터 구현


        System.out.println("소리낸 횟수: " + DuckDecorator.getNumberOfQuacks());


    }


    public void simulate(Quackable quackable) {
        quackable.quack();
    }
}
