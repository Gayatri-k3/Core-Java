package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Appliance;

public class WashingMachine extends Appliance {
    public WashingMachine() {
        super();
        System.out.println("no-arg const of washing machine");
    }

    @Override
    public void start() {
        System.out.println("running start in washing machine");
    }

    public void washClothes() {
        System.out.println("running washClothes in washing machine");
    }
}
