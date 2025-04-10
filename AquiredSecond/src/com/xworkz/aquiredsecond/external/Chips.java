package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Snack;

public class Chips extends Snack {
    public Chips() {
        super();
        System.out.println("no-arg const of chips");
    }

    @Override
    public void pack() {
        System.out.println("running pack in chips");
    }

    public void crunch() {
        System.out.println("running crunch in chips");
    }
}
