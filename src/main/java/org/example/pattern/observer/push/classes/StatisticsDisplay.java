package org.example.pattern.observer.push.classes;

import org.example.pattern.observer.push.interfaces.Display;
import org.example.pattern.observer.push.interfaces.Observer;

//측정치의 최솟값, 평균, 최댓값을 보여준다.
public class StatisticsDisplay implements Display, Observer {

    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        display();
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("==============기상 통계==============");
        System.out.println("===================================");
        System.out.println();
    }
}
