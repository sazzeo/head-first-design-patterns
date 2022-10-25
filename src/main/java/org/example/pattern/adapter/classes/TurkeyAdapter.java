package org.example.pattern.adapter.classes;

import org.example.pattern.adapter.interfaces.Duck;
import org.example.pattern.adapter.interfaces.Turkey;

public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    //어뎁터 이식
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
