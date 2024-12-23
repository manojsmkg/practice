package org.practice.designPatterns.abstractFactory.model;

public class Modern extends Style{
    @Override
    public Furniture createCoffeeTable()
    {
        System.out.println("Creating Coffee Table :  Modern Style");
        return new CoffeeTable();
    }
    @Override
    public Furniture createChair()
    {
        System.out.println("Creating Chair :  Modern Style");
        return new Chair();
    }
    @Override
    public Furniture createSofa()
    {
        System.out.println("Creating Sofa :  Modern Style");
        return new Sofa();
    }


}
