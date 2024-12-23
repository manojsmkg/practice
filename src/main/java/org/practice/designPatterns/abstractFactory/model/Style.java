package org.practice.designPatterns.abstractFactory.model;

public abstract class Style {
    public Furniture createCoffeeTable()
    {
        System.out.println("Creating Coffee Table");
        return new CoffeeTable();
    }
    public Furniture createChair()
    {
        System.out.println("Creating Chair");
        return new Chair();
    }
    public Furniture createSofa()
    {
        System.out.println("Creating Sofa");
        return new Sofa();
    }


}
