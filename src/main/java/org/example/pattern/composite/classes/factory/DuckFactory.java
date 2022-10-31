package org.example.pattern.composite.classes.factory;

import org.example.pattern.composite.classes.Duck1;
import org.example.pattern.composite.classes.Duck2;
import org.example.pattern.composite.classes.Duck3;
import org.example.pattern.composite.classes.Duck4;
import org.example.pattern.composite.interfaces.Quackable;


// AbstractDuckFactory를 구현한  클래스
public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createDuck1() {
        return new Duck1();
    }

    @Override
    public Quackable createDuck2() {
        return new Duck2();
    }

    @Override
    public Quackable createDuck3() {
        return new Duck3();
    }

    @Override
    public Quackable createDuck4() {
        return new Duck4();
    }
}
