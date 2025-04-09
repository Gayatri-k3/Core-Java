package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Garage;

public class G_Accessor {
    Garage garage;

    public G_Accessor(Garage garage) {
        this.garage = garage;
        System.out.println("Garage Accessor Constructor");
    }

    public void show() {
        System.out.println("Owner: " + garage.getOwner());
        System.out.println("Capacity: " + garage.getCapacity());
        System.out.println("Type: " + garage.getType());
        System.out.println("Open 24hrs?: " + garage.getOpen24hrs());
        System.out.println("Area: " + garage.getArea() + " sq.ft");
    }
}
