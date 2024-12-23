package org.practice.liskov.models;

public class Vehicle {
    int wheels;
    public int getNumWheels()
    {
        return 2;
    }
    public String getVehicleName()
    {
        return "Base class";
    }
}
