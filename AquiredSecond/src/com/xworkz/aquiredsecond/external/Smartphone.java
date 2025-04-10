package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Device;

public class Smartphone extends Device {
    public Smartphone() {
        super();
        System.out.println("no-arg const of smartphone");
    }

    @Override
    public void powerOn() {
        System.out.println("running powerOn in smartphone");
    }

    public void installApp() {
        System.out.println("running installApp in smartphone");
    }
}
