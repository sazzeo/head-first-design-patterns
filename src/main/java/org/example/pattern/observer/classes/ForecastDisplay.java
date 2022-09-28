package org.example.pattern.observer.classes;

import org.example.pattern.observer.interfaces.Display;
import org.example.pattern.observer.interfaces.Observer;

//날씨 예보를 보여준다.
public class ForecastDisplay implements Display , Observer {



    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
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
        System.out.println("==============기상 예보==============");


        System.out.println("===================================");
        System.out.println();
    }

}
