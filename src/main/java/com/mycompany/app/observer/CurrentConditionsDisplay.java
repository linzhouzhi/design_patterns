package com.mycompany.app.observer;

/**
 * Created by lzz on 6/18/16.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private  float temperature;
    private  float humidity;
    private  Subject weatherData;

    public CurrentConditionsDisplay( Subject weatherData ){
        this.weatherData = weatherData;
        weatherData.registerObserver( this );
    }

    public void display() {
        System.out.println( "current conditions: " + temperature + "F degrees abd " + humidity );
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
