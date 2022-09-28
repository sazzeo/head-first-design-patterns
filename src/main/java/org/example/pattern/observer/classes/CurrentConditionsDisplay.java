package org.example.pattern.observer.classes;

import org.example.pattern.observer.interfaces.Display;
import org.example.pattern.observer.interfaces.Observer;

//현재 날씨 데이터 값을 보여준다.
public class CurrentConditionsDisplay implements Observer, Display {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    //생성자를 통해 옵저버 등록
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    //값이 바뀔 때 마다 호출됨.
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature= temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("==============현재 조건==============");
        System.out.println(String.format("온도: %f도" , temperature));
        System.out.println(String.format("습도: %f %%" , humidity));
        System.out.println("===================================");
        System.out.println();
    }
}
