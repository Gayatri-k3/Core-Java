package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Mountain;

public class Himalaya extends Mountain {
    public Himalaya() {
        super();
        System.out.println("no-arg const of himalaya");
    }

    @Override
    public void standTall() {
        System.out.println("running standTall in himalaya");
    }

    public void attractClimbers() {
        System.out.println("running attractClimbers in himalaya");
    }
}
