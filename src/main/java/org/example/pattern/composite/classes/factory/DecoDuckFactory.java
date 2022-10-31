package org.example.pattern.composite.classes.factory;

import org.example.pattern.composite.classes.Duck1;
import org.example.pattern.composite.classes.Duck2;
import org.example.pattern.composite.classes.Duck3;
import org.example.pattern.composite.classes.Duck4;
import org.example.pattern.composite.classes.decorator.DuckDecorator;
import org.example.pattern.composite.interfaces.Quackable;


//데코레이터 반환 팩토리
public class DecoDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createDuck1() {
        return new DuckDecorator(new Duck1());
    }

    @Override
    public Quackable createDuck2() {
        return new DuckDecorator(new Duck2());
    }

    @Override
    public Quackable createDuck3() {
        return new DuckDecorator(new Duck3());
    }

    @Override
    public Quackable createDuck4() {
        return new DuckDecorator(new Duck4());
    }
}
