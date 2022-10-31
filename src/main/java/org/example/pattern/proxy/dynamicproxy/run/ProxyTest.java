package org.example.pattern.proxy.dynamicproxy.run;

import org.example.pattern.proxy.dynamicproxy.classes.PersonImpl;
import org.example.pattern.proxy.dynamicproxy.classes.PersonProxy;
import org.example.pattern.proxy.dynamicproxy.interfaces.Person;

public class ProxyTest {

    public static void main(String[] args) {
        
        Person jeeyoung = new PersonImpl("지영");
        PersonProxy personProxy = new PersonProxy();
        Person ownerProxy = personProxy.getOwnerProxy(jeeyoung);

        ownerProxy.setGender("여자");
        ownerProxy.setInterests("멍때리기");

        System.out.println(ownerProxy);

    }
}
