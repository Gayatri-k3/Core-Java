package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.VehiclePart;

public class Engine extends VehiclePart {
    public Engine() {
        super();
        System.out.println("no-arg const of engine");
    }

    @Override
    public void function() {
        System.out.println("running function in engine");
    }

    public void ignite() {
        System.out.println("running ignite in engine");
    }
}
