package com.xworkz.encapsulation.internal;

public class Tank {
    private String type = "Battle Tank";
    private String model = "T-90";
    private double weight = 46.5;
    private int crew = 3;
    private boolean active = true;

    public Tank() {
        System.out.println("Tank Constructor");
    }

    void setType(String type) {
        this.type = type;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    void setCrew(int crew) {
        this.crew = crew;
    }

    void setActive(boolean active) {
        this.active = active;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getCrew() {
        return this.crew;
    }

    public boolean getActive() {
        return this.active;
    }
}

