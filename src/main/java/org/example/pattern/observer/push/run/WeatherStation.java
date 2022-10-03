package org.example.pattern.observer.push.run;

import org.example.pattern.observer.push.classes.CurrentConditionsDisplay;
import org.example.pattern.observer.push.classes.ForecastDisplay;
import org.example.pattern.observer.push.classes.StatisticsDisplay;
import org.example.pattern.observer.push.classes.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(18.0f , 85f, 1013.8f);
        weatherData.setMeasurements(19.0f , 75f, 1014.7f);
        weatherData.setMeasurements(20.5f , 90f, 1014.1f);
    }
}
