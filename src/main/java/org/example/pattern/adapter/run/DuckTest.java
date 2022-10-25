package org.example.pattern.adapter.run;

import org.example.pattern.adapter.classes.MallardDuck;
import org.example.pattern.adapter.classes.TurkeyAdapter;
import org.example.pattern.adapter.classes.WildTurkey;
import org.example.pattern.adapter.interfaces.Duck;
import org.example.pattern.adapter.interfaces.Turkey;

public class DuckTest {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck TurkeyAdapter = new TurkeyAdapter(turkey);





    }
}
