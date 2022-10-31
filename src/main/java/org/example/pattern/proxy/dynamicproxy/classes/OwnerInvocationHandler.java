package org.example.pattern.proxy.dynamicproxy.classes;

import org.example.pattern.proxy.dynamicproxy.interfaces.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//프록시를 실행하는 객체  => Person 객체를 본인이 호출할경우
//본인이 자신의 rating을 set하는건 막아야함.
public class OwnerInvocationHandler implements InvocationHandler {

    private Person person;

    public OwnerInvocationHandler(Person person) {
        this.person = person;
    }



    //invoke의 역할 => 프록시의 어떤 메소드가 호출되든 반드시 이 메소드가 호출된다.
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {

        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(proxy, args);
            }
            if (method.getName().equals("setGeekRating")) {
                throw new RuntimeException("본인을 평가할수 없습니다.");
            }
            if (method.getName().startsWith("set")) {
                return method.invoke(proxy, args);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

}
