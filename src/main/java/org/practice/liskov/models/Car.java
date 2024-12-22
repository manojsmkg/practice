package org.practice.liskov.models;

public class Car extends EngineVehicle{
    @Override
    public int getNumWheels()
    {
        return 4;
    }

    @Override
    public String getVehicleName()
    {
        return "Car";
    }

}
