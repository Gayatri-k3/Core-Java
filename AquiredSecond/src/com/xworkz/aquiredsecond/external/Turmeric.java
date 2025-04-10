package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Spice;

public class Turmeric extends Spice {
    public Turmeric() {
        super();
        System.out.println("no-arg const of turmeric");
    }

    @Override
    public void addFlavor() {
        System.out.println("running addFlavor in turmeric");
    }

    public void heal() {
        System.out.println("running heal in turmeric");
    }
}
