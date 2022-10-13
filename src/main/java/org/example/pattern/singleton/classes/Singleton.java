package org.example.pattern.singleton.classes;


//싱글톤 기본 : thread safe 하지 않음
public class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton =  new Singleton();
        }
        return singleton;

    }

}
