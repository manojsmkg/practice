package org.practice.designPatterns.abstractFactory.model;

public class Victorian extends Style{
    @Override
    public Furniture createCoffeeTable()
    {
        System.out.println("Creating Coffee Table :  Victorian Style");
        return new CoffeeTable();
    }
    @Override
    public Furniture createChair()
    {
        System.out.println("Creating Chair :  Victorian Style");
        return new Chair();
    }
    @Override
    public Furniture createSofa()
    {
        System.out.println("Creating Sofa :  Victorian Style");
        return new Sofa();
    }


}
