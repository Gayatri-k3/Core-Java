package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Driver;

public class BusDriver extends Driver {
    public BusDriver() {
        super();
        System.out.println("no-arg const of busDriver");
    }

    @Override
    public void drive() {
        System.out.println("running drive in busDriver");
    }

    public void stopAtStation() {
        System.out.println("running stopAtStation in busDriver");
    }
}
