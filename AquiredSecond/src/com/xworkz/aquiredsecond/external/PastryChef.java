package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Chef;

public class PastryChef extends Chef {
    public PastryChef() {
        super();
        System.out.println("no-arg const of pastryChef");
    }

    @Override
    public void cook() {
        System.out.println("running cook in pastryChef");
    }

    public void bakeCake() {
        System.out.println("running bakeCake in pastryChef");
    }
}
