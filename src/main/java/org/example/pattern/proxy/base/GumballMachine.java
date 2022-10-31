package org.example.pattern.proxy.base;

public class GumballMachine {

    //상태 변수들
    private State soldOutState; // 재고 없는 상태
    private State noQuarterState; //동전 없는 상태

    private State soldState;

    private State hasQuarterState;

    //실제 상태를 담을 변수
    private State state;
    private int count = 0; //캡슐 개수

    private String location;  //추가된 필드변수

    public GumballMachine(String location, int count) {

        this.location = location;
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.soldState = new SoldState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.count = count;

        if(this.count > 0 ) {
            this.state = noQuarterState;
        }
        if(this.count <= 0) {
            this.state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    //상태 전환  => 다른 state 서브 클래스에서 이 메소드를 사용하게 됨
    public void setState(State state) {
        this.state = state;
    }


    public void releaseBall() {
        System.out.println("캡슐이 나왔습니다.");
        this.count--;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public boolean isEmpty() {
        return count <= 0;
    }

    public int getCount() {
        return count;
    }

    public String getState() {
        return state.getClass().getName();
    }

    public String getLocation() {
        return location;
    }
}
