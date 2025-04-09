package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Jet;

public class J_Accessor {
    Jet jet;

    public J_Accessor(Jet jet) {
        this.jet = jet;
        System.out.println("Jet Accessor Constructor");
    }

    public void show() {
        System.out.println("Name: " + jet.getName());
        System.out.println("Type: " + jet.getType());
        System.out.println("Speed: " + jet.getSpeed());
        System.out.println("Stealth?: " + jet.getStealth());
        System.out.println("Range: " + jet.getRange() + " km");
    }
}
