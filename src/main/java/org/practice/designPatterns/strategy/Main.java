package org.practice.designPatterns.strategy;

import org.practice.designPatterns.strategy.models.NormalVehicle;
import org.practice.designPatterns.strategy.models.SportsVehicle;
import org.practice.designPatterns.strategy.models.Vehicle;

import java.util.ArrayList;
import java.util.List;


//Strategy Pattern : When multiple child classes may have same functionality , instead of duplicating code across those multiple
// child classes create strategies by using interface and concrete classes , then inject that strategy in base class and child classes

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new SportsVehicle());
        vehicles.add(new NormalVehicle());
        vehicles.add(new SportsVehicle());

        for(Vehicle vehicle : vehicles)
        {
            vehicle.drive();
        }

    }
}