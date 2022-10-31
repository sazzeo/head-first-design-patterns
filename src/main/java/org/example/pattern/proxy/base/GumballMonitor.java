package org.example.pattern.proxy.base;

public class GumballMonitor {

    private GumballMachine gumballMachine;


    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("캡슐 개수 : " + gumballMachine.getCount());
        System.out.println("위치 : " + gumballMachine.getLocation());
        System.out.println("상태 : " + gumballMachine.getState());
    }
}
