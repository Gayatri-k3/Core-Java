package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.ElectronicItem;

public class Fan extends ElectronicItem {
    public Fan() {
        super();
        System.out.println("no-arg const of fan");
    }

    @Override
    public void consumeElectricity() {
        System.out.println("running consumeElectricity in fan");
    }

    public void rotate() {
        System.out.println("running rotate in fan");
    }
}
