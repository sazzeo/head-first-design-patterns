package org.example.pattern.proxy.dynamicproxy.classes;

import org.example.pattern.proxy.dynamicproxy.interfaces.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//프록시를 실행하는 객체  => Person 객체를 다른사람이 호출할경우
//rating만 가능, 나머지 불가
public class NonOwnerInvocationHandler implements InvocationHandler {

    private Person person;

    public NonOwnerInvocationHandler(Person person) {
        this.person = person;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {

        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(proxy, args);
            }
            if (method.getName().equals("setGeekRating")) {
                return method.invoke(proxy, args);
             
            }
            if (method.getName().startsWith("set")) {
                throw new RuntimeException("본인만 수정 가능합니다.");
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
