package org.example.pattern.state.run;

import org.example.pattern.state.classes.GumballMachine;

public class MachineRunning {

    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(3);

        gumballMachine.insertQuarter(); //동전넣기
        gumballMachine.turnCrank();


        gumballMachine.insertQuarter();

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
    }
}
