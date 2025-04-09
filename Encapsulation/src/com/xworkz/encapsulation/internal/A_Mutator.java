package com.xworkz.encapsulation.internal;

public class A_Mutator {
    Apartment apartment;

    public A_Mutator(Apartment apartment) {
        this.apartment = apartment;
        System.out.println("Apartment Mutator Constructor");
    }

    public void mutator() {
        Apartment apartment = new Apartment();
        apartment.setName("Sky Heights");
        apartment.setFloors(15);
        apartment.setFlatsPerFloor(6);
        apartment.setHasLift(true);
        apartment.setLocation("Whitefield");

        System.out.println("Name: " + apartment.getName());
        System.out.println("Floors: " + apartment.getFloors());
        System.out.println("Flats per floor: " + apartment.getFlatsPerFloor());
        System.out.println("Has lift?: " + apartment.getHasLift());
        System.out.println("Location: " + apartment.getLocation());
    }
}
