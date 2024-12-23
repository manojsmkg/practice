package org.practice.designPatterns.factory;


import org.practice.designPatterns.factory.model.*;

/*
Factory Pattern is a creational design pattern that provides an interface for creating objects in superclass
but allows subclasses to alter the type of objects that will be created.
 */
public class Main {
    public static void main(String[] args)
    {
        //expecting to deliver by road
        Logistics roadLogistics = new RoadLogistics();
        Transport roadTransport = roadLogistics.createTransport();
        roadTransport.deliver();

        //expecting to deliver by sea
        Logistics seaLogistics = new SeaLogistics();
        Transport seaTransport = seaLogistics.createTransport();
        seaTransport.deliver();

    }
}