package org.practice.liskov.models;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Cycle());
        vehicles.add(new MotorCycle());
        for(Vehicle v : vehicles )
        {
            System.out.println(v.getVehicleName() +  ":" + v.getNumWheels());
        }

    }
}