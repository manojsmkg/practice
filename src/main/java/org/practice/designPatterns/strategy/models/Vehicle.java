package org.practice.designPatterns.strategy.models;

import org.practice.designPatterns.strategy.interfaces.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy)
    {
        this.driveStrategy = driveStrategy;
    }

    public void drive()
    {
        driveStrategy.drive();
    }


}
