package org.example.pattern.proxy.dynamicproxy.run;

import org.example.pattern.proxy.dynamicproxy.classes.NonOwnerInvocationHandler;
import org.example.pattern.proxy.dynamicproxy.classes.OwnerInvocationHandler;
import org.example.pattern.proxy.dynamicproxy.classes.PersonImpl;
import org.example.pattern.proxy.dynamicproxy.classes.PersonProxy;
import org.example.pattern.proxy.dynamicproxy.interfaces.Person;

import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        
        Person jeeyoung = new PersonImpl("지영");
        PersonProxy personProxy = new PersonProxy();
        Person ownerProxy = personProxy.getOwnerProxy(jeeyoung);

        ownerProxy.setInterests("멍때리기");

        System.out.println(ownerProxy);

    }

    public static Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                // person.getClass().getInterfaces() , //이 클래스가 상속받을 인터페이스
                new Class<?>[]{Person.class} , //이 클래스가 상속받을 인터페이스
                new OwnerInvocationHandler(person)); // 이 클래스가 만들 객체 => 얘기 invoke를 실행함
    }

    public Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces() ,
                new NonOwnerInvocationHandler(person));
    }

}
