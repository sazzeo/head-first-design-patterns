package org.example.pattern.proxy.dynamicproxy.classes;

import lombok.ToString;
import org.example.pattern.proxy.dynamicproxy.interfaces.Person;


@ToString
//주제 객체
public class PersonImpl implements Person {

    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int ratingCount =0;

    public PersonImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getGeekRating() {
        if(ratingCount==0) return 0;
        return (rating/ratingCount);
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
        this.ratingCount++;
    }

    @Override
    public void setGeekRating(int rating) {

    }


}
