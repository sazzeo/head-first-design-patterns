package org.example.pattern.proxy.base;


//상태를 나타내는 인터페이스
public interface State {

    //동전 투입
    void insertQuarter();

    //동전 반환
    void ejectQuarter() ;

    //뽑기 머신 돌리기
    void turnCrank();

    //캡슐 내보내기
    void dispense();
}
