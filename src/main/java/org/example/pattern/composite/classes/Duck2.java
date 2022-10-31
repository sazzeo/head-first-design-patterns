package org.example.pattern.composite.classes;

import org.example.pattern.composite.interfaces.Quackable;

public class Duck2 implements Quackable {
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
