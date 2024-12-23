package org.practice.designPatterns.factory.model;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery through Road Transport initialized");
    }
}
