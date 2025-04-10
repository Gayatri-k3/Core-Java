package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.FlyingAnimal;

public class Eagle extends FlyingAnimal {
    public Eagle() {
        super();
        System.out.println("no-arg const of eagle");
    }

    @Override
    public void soar() {
        System.out.println("running soar in eagle");
    }

    public void hunt() {
        System.out.println("running hunt in eagle");
    }
}
