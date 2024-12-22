package org.practice.liskov.models;

public class Cycle extends Vehicle{
    @Override
    public int getNumWheels() {
        return super.getNumWheels();
    }

    @Override
    public String getVehicleName()
    {
        return "Cycle";
    }

}
