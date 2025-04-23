package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Vehicle;

public class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
    public void accelerate() {
        System.out.println("Car is accelerating");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
}