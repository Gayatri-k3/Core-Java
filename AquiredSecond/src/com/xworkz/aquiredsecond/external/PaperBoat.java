package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Craft;

public class PaperBoat extends Craft {
    public PaperBoat() {
        super();
        System.out.println("no-arg const of paperBoat");
    }

    @Override
    public void create() {
        System.out.println("running create in paperBoat");
    }

    public void floatInWater() {
        System.out.println("running floatInWater in paperBoat");
    }
}
