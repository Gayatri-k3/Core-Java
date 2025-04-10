package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Beverage;

public class Tea extends Beverage {
    public Tea() {
        super();
        System.out.println("no-arg const of tea");
    }

    @Override
    public void drink() {
        System.out.println("running drink in tea");
    }

    public void addMilk() {
        System.out.println("running addMilk in tea");
    }
}
