package org.practice.designPatterns.observer;


import org.practice.designPatterns.observer.model.InternetWeatherObserver;
import org.practice.designPatterns.observer.model.SatelliteWeatherObserver;
import org.practice.designPatterns.observer.model.WeatherStation;

//Observer Design Pattern : When the state of one object needs to be tracked, like some state change happens in one particular object and multiple listeners needs
//to be notified then this observer design pattern comes handy.
public class Main {
    public static void main(String[] args)
    {
        WeatherStation weatherStation = new WeatherStation();
        SatelliteWeatherObserver satelliteWeatherObserver = new SatelliteWeatherObserver();
        InternetWeatherObserver internetWeatherObserver = new InternetWeatherObserver();
        //updating temperature , expecting no print statements as observers are not added yet
        weatherStation.setTemperature(50);
        //adding both observers
        weatherStation.addObserver(satelliteWeatherObserver);
        weatherStation.addObserver(internetWeatherObserver);
        //updating temperature , expecting 2 print statements from both observers
        weatherStation.setTemperature(40);

        weatherStation.removeObserver(internetWeatherObserver);

        //updating temperature , expecting 1 print statement from satellite weather observer as internet observer is removed
        weatherStation.setTemperature(30);
    }
}