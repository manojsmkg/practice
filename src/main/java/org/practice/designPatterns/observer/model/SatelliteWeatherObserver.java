package org.practice.designPatterns.observer.model;

public class SatelliteWeatherObserver implements Observer {

    @Override
    public void update(int temp)
    {
        System.out.println("Temperature updated in Satellite display : " + temp);
    }
}
