package com.xworkz.encapsulation.internal;

public class J_Mutator {
    Jet jet;

    public J_Mutator(Jet jet) {
        this.jet = jet;
        System.out.println("Jet Mutator Constructor");
    }

    public void mutator() {
        Jet jet = new Jet();
        jet.setName("Raptor");
        jet.setType("Stealth Fighter");
        jet.setSpeed(2980.0);
        jet.setStealth(true);
        jet.setRange(2200);

        System.out.println("Name: " + jet.getName());
        System.out.println("Type: " + jet.getType());
        System.out.println("Speed: " + jet.getSpeed());
        System.out.println("Stealth?: " + jet.getStealth());
        System.out.println("Range: " + jet.getRange() + " km");
    }
}
