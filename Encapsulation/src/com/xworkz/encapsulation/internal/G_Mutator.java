package com.xworkz.encapsulation.internal;

public class G_Mutator {
    Garage garage;

    public G_Mutator(Garage garage) {
        this.garage = garage;
        System.out.println("Garage Mutator Constructor");
    }

    public void mutator() {
        Garage garage = new Garage();
        garage.setOwner("Ramesh");
        garage.setCapacity(30);
        garage.setType("Four-Wheeler");
        garage.setOpen24hrs(true);
        garage.setArea(2500.5);

        System.out.println("Owner: " + garage.getOwner());
        System.out.println("Capacity: " + garage.getCapacity());
        System.out.println("Type: " + garage.getType());
        System.out.println("Open 24hrs?: " + garage.getOpen24hrs());
        System.out.println("Area: " + garage.getArea() + " sq.ft");
    }
}
