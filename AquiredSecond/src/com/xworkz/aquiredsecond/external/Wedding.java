package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Event;

public class Wedding extends Event {
    public Wedding() {
        super();
        System.out.println("no-arg const of wedding");
    }

    @Override
    public void organize() {
        System.out.println("running organize in wedding");
    }

    public void exchangeVows() {
        System.out.println("running exchangeVows in wedding");
    }
}
