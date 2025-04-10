package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Bird;

public class Parrot extends Bird {
    public Parrot() {
        super();
        System.out.println("no-arg const of parrot");
    }

    @Override
    public void fly() {
        System.out.println("running fly in parrot");
    }

    public void mimic() {
        System.out.println("running mimic in parrot");
    }
}
