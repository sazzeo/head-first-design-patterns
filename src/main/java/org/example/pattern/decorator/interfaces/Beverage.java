package org.example.pattern.decorator.interfaces;

public abstract class Beverage {
    protected String description = "제목없음";

    public enum  Size { TALL , GRANDE , VENTI}

    protected Size size = Size.TALL;


    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void print() {
        System.out.println(this.getDescription() + " : " + this.cost()+"$");
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
