package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Toy;

public class TeddyBear extends Toy {
    public TeddyBear() {
        super();
        System.out.println("no-arg const of teddy bear");
    }

    @Override
    public void display() {
        System.out.println("running display in teddy bear");
    }

    public void hug() {
        System.out.println("running hug in teddy bear");
    }
}
