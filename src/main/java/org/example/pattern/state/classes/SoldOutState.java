package org.example.pattern.state.classes;

import org.example.pattern.state.interfaces.State;

public class SoldOutState implements State {


    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("매진 되었습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("매진 되었습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("매진 되었습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("매진 되었습니다.");
    }
}
