package com.xworkz.encapsulation.internal;

public class Apartment {
    private String name = "Green Residency";
    private int floors = 10;
    private int flatsPerFloor = 4;
    private boolean hasLift = true;
    private String location = "Rajajinagar";

    public Apartment() {
        System.out.println("Apartment Constructor");
    }

    void setName(String name) {
        this.name = name;
    }

    void setFloors(int floors) {
        this.floors = floors;
    }

    void setFlatsPerFloor(int flatsPerFloor) {
        this.flatsPerFloor = flatsPerFloor;
    }

    void setHasLift(boolean hasLift) {
        this.hasLift = hasLift;
    }

    void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return this.name;
    }

    public int getFloors() {
        return this.floors;
    }

    public int getFlatsPerFloor() {
        return this.flatsPerFloor;
    }

    public boolean getHasLift() {
        return this.hasLift;
    }

    public String getLocation() {
        return this.location;
    }
}
