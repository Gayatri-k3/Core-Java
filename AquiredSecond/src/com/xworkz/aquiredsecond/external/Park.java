package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Place;

public class Park extends Place {
    public Park() {
        super();
        System.out.println("no-arg const of park");
    }

    @Override
    public void visit() {
        System.out.println("running visit in park");
    }

    public void play() {
        System.out.println("running play in park");
    }
}
