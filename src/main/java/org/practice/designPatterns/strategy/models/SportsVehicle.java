package org.practice.designPatterns.strategy.models;

import org.practice.designPatterns.strategy.interfaces.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
