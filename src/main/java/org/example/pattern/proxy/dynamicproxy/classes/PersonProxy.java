package org.example.pattern.proxy.dynamicproxy.classes;

import org.example.pattern.proxy.dynamicproxy.interfaces.Person;

import java.lang.reflect.Proxy;

public class PersonProxy {
    
    
    //Proxy객체를 만들어 proxy를 리턴함
    
    public Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces() , //이 클래스가 상속받을 인터페이스
                new OwnerInvocationHandler(person)); // 이 클래스가 만들 객체 => 얘기 invoke를 실행함
    }

    public Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces() ,
                new NonOwnerInvocationHandler(person));
    }

}
