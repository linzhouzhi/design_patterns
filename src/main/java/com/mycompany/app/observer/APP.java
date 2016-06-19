package com.mycompany.app.observer;

/**
 * Created by lzz on 6/18/16.
 */
public class APP {
    public static void main( String[] args ){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay( weatherData );
        weatherData.setMeasurements( 60,70,34.3f );
    }
}
