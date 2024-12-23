package org.practice.designPatterns.observer.model;

public class InternetWeatherObserver implements Observer {

    @Override
    public void update(int temp)
    {
        System.out.println("Temperature updated in Internet display : " + temp);
    }
}
