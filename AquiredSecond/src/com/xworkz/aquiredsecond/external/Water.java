package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.NaturalResource;

public class Water extends NaturalResource {
    public Water() {
        super();
        System.out.println("no-arg const of water");
    }

    @Override
    public void sustainLife() {
        System.out.println("running sustainLife in water");
    }

    public void hydrate() {
        System.out.println("running hydrate in water");
    }
}
