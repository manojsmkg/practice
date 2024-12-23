package org.practice.designPatterns.abstractFactory.model;

public class Chair extends Furniture {
    @Override
    public void whatAmI()
    {
        System.out.println("I am a Chair");
    }
}
