package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Apartment;

public class A_Accessor {
    Apartment apartment;

    public A_Accessor(Apartment apartment) {
        this.apartment = apartment;
        System.out.println("Apartment Accessor Constructor");
    }

    public void show() {
        System.out.println("Name: " + apartment.getName());
        System.out.println("Floors: " + apartment.getFloors());
        System.out.println("Flats per floor: " + apartment.getFlatsPerFloor());
        System.out.println("Has lift?: " + apartment.getHasLift());
        System.out.println("Location: " + apartment.getLocation());
    }
}
