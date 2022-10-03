package org.example.pattern.observer.pull.run;

import org.example.pattern.observer.pull.classes.CurrentConditionsDisplay;
import org.example.pattern.observer.pull.classes.WeatherData;

public class PullStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(18.0f , 85f, 1013.8f);

        //정보가 set될 때가 아닌 notify 호출시에만 정보가 업데이트 됨.
        weatherData.notifyObservers();
    }
}
