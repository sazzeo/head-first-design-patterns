package org.example.pattern.singleton.run;

import org.example.pattern.singleton.classes.Singleton;

public class Run {

    public static void main(String[] args) {

         Singleton singleton1 = Singleton.getInstance();
         Singleton singleton2 = Singleton.getInstance();
         Singleton singleton3 = Singleton.getInstance();
         Singleton singleton4 = Singleton.getInstance();
         Singleton singleton5 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
    }
}
