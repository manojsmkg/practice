package org.practice.designPatterns.abstractFactory;

import org.practice.designPatterns.abstractFactory.model.*;


/*
Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes
when you can group multiple classes into some categories abstract factory pattern is useful
 */
public class Main {

    public static void main(String[] args)
    {
        Style style = new ArtDeco();
        Furniture furniture = style.createCoffeeTable();
        furniture.whatAmI();

        style = new Modern();
        furniture = style.createSofa();
        furniture.whatAmI();

        style = new Victorian();
        furniture = style.createChair();
        furniture.whatAmI();
    }
}
