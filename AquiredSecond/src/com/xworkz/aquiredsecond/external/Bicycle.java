package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Vehicle;

public class Bicycle extends Vehicle {
    public Bicycle() {
        super();
        System.out.println("no-arg const of bicycle");
    }

    @Override
    public void move() {
        System.out.println("running move in bicycle");
    }

    public void ringBell() {
        System.out.println("running ringBell in bicycle");
    }
}
