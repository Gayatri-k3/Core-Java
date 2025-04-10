package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.KitchenAppliance;

public class Mixer extends KitchenAppliance {
    public Mixer() {
        super();
        System.out.println("no-arg const of mixer");
    }

    @Override
    public void plugIn() {
        System.out.println("running plugIn in mixer");
    }

    public void blend() {
        System.out.println("running blend in mixer");
    }
}
