package org.practice.designPatterns.factory.model;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery through Sea Transport initialized");
    }
}
