package org.example.pattern.proxy.dynamicproxy.interfaces;


//주제와 프록시 객체의 기반이 되는 인터페이스
public interface Person {

    String getName();
    String getGender();
    String getInterests();
    int getGeekRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setGeekRating(int rating);

    String toString();

}
