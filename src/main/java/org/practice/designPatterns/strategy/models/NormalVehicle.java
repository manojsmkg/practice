package org.practice.designPatterns.strategy.models;

import org.practice.designPatterns.strategy.interfaces.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
