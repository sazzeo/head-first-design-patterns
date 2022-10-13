package org.example.pattern.singleton.classes;


//내부 클래스로 만드는 thread safe한 + 최적화 싱글톤
public class PerfectSingleton {

    private PerfectSingleton() {
    }


    //내부 클래스
    private static final class SingletonHolder {
        static final PerfectSingleton singleton = new PerfectSingleton();
    }

    public static PerfectSingleton getInstance() {

        return SingletonHolder.singleton;
    }

}
