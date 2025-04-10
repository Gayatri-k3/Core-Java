package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Transport;

public class Bus extends Transport {
    public Bus() {
        super();
        System.out.println("no-arg const of bus");
    }

    @Override
    public void operate() {
        System.out.println("running operate in bus");
    }

    public void pickPassengers() {
        System.out.println("running pickPassengers in bus");
    }
}
