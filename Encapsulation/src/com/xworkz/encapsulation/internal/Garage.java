package com.xworkz.encapsulation.internal;

public class Garage {
    private String owner = "Karthik";
    private int capacity = 15;
    private String type = "Two-Wheeler";
    private boolean open24hrs = false;
    private double area = 1200.0;

    public Garage() {
        System.out.println("Garage Constructor");
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void setType(String type) {
        this.type = type;
    }

    void setOpen24hrs(boolean open24hrs) {
        this.open24hrs = open24hrs;
    }

    void setArea(double area) {
        this.area = area;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getType() {
        return this.type;
    }

    public boolean getOpen24hrs() {
        return this.open24hrs;
    }

    public double getArea() {
        return this.area;
    }
}
