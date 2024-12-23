package org.practice.designPatterns.factory.model;

public class RoadLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
