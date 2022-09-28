package org.example.pattern.observer;

public class WeatherData {

    public float getTemperature() {

        return 0;
    }

    public float getHumidity() {


        return 0;
    }

    public float getPressure() {


        return 0;
    }

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionDisplay.update(tem)


    }
}
