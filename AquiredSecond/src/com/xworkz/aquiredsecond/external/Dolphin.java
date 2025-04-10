package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.AquaticAnimal;

public class Dolphin extends AquaticAnimal {
    public Dolphin() {
        super();
        System.out.println("no-arg const of dolphin");
    }

    @Override
    public void floatInWater() {
        System.out.println("running floatInWater in dolphin");
    }

    public void communicate() {
        System.out.println("running communicate in dolphin");
    }
}
