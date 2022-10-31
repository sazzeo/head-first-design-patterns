package org.example.pattern.composite.classes.adapter;

import org.example.pattern.composite.classes.Goose1;
import org.example.pattern.composite.interfaces.Quackable;


//어댑터 구현하기
public class GooseAdapter implements Quackable {


    Goose1 goose1; // 어댑터 뒤쪽 클래스를 필드변수로 선언한다


    public GooseAdapter(Goose1 goose1) {
        this.goose1 = goose1;
    }

    @Override
    public void quack() {
        goose1.honk();
    }
}
