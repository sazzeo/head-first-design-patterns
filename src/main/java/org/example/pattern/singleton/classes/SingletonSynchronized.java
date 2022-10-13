package org.example.pattern.singleton.classes;


// thread safe 한 싱글톤
public class SingletonSynchronized {

    private static SingletonSynchronized singletonSynchronized;

    private SingletonSynchronized() {
    }

    public static SingletonSynchronized getInstance() {
        if(singletonSynchronized == null) {
            synchronized (singletonSynchronized) {
                if(singletonSynchronized == null) {
                    singletonSynchronized = new SingletonSynchronized();
                }
            }
        }
        return singletonSynchronized;
    }
}
