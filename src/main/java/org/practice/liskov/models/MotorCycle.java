package org.practice.liskov.models;

public class MotorCycle extends EngineVehicle{

    @Override
    public int getNumWheels()
    {
        return 2;
    }

    @Override
    public String getVehicleName()
    {
        return "Motor Cycle";
    }


}
