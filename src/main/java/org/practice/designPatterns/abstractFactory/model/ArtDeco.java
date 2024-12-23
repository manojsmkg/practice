package org.practice.designPatterns.abstractFactory.model;

public class ArtDeco extends Style{
    @Override
    public Furniture createCoffeeTable()
    {
        System.out.println("Creating Coffee Table :  ArtDeco Style");
        return new CoffeeTable();
    }
    @Override
    public Furniture createChair()
    {
        System.out.println("Creating Chair :  ArtDeco Style");
        return new Chair();
    }
    @Override
    public Furniture createSofa()
    {
        System.out.println("Creating Sofa :  ArtDeco Style");
        return new Sofa();
    }


}
