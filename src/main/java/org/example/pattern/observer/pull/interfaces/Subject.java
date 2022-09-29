package org.example.pattern.observer.pull.interfaces;

public interface Subject {

    /*옵저버가 추가되었을 때*/
    void registerObserver(Observer observer);

    /*옵저버가 삭제되었을 때*/
    void removeObserver(Observer Observer);

    /*옵저버가 가 구독되거나 구독해제 되었을 때 알림*/
    void notifyObservers();

}
