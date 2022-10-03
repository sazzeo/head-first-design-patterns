package org.example.pattern.observer.pull.classes;

import org.example.pattern.observer.pull.interfaces.Display;
import org.example.pattern.observer.pull.interfaces.Observer;

//현재 날씨 데이터 값을 보여준다.
public class CurrentConditionsDisplay implements Observer, Display {

    private float temperature;
    private float humidity;
    private WeatherData weatherData ;

    //생성자를 통해 옵저버 등록
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature= weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
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
