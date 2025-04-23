package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Oven;

public class MicrowaveOven implements Oven {
    public void preheat() {
        System.out.println("Preheating oven");
    }
    public void bake() {
        System.out.println("Baking");
    }
    public void grill() {
        System.out.println("Grilling");
    }
    public void defrost() {
        System.out.println("Defrosting");
    }
    public void turnOff() {
        System.out.println("Oven turned off");
    }
}
