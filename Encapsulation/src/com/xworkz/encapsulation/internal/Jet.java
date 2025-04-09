package com.xworkz.encapsulation.internal;

public class Jet {
    private String name = "Falcon";
    private String type = "Fighter";
    private double speed = 2400.5;
    private boolean stealth = false;
    private int range = 1500;

    public Jet() {
        System.out.println("Jet Constructor");
    }

    void setName(String name) {
        this.name = name;
    }

    void setType(String type) {
        this.type = type;
    }

    void setSpeed(double speed) {
        this.speed = speed;
    }

    void setStealth(boolean stealth) {
        this.stealth = stealth;
    }

    void setRange(int range) {
        this.range = range;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public double getSpeed() {
        return this.speed;
    }

    public boolean getStealth() {
        return this.stealth;
    }

    public int getRange() {
        return this.range;
    }
}
