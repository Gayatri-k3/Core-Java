package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Festival;

public class Diwali extends Festival {
    public Diwali() {
        super();
        System.out.println("no-arg const of diwali");
    }

    @Override
    public void celebrate() {
        System.out.println("running celebrate in diwali");
    }

    public void burstCrackers() {
        System.out.println("running burstCrackers in diwali");
    }
}
