package org.example.pattern.decorator.interfaces;


//첨가물 추상 데코레이터
public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public abstract String getDescription();

}
