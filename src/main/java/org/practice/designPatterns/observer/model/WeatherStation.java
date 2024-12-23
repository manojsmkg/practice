package org.practice.designPatterns.observer.model;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

    List<Observer> observers = new ArrayList<>();
    int temp;
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers)
            observer.update(this.temp);
    }

    public void setTemperature(int temp) {
        this.temp = temp;
        this.notifyObservers();
    }
}
