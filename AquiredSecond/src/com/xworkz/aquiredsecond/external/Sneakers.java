package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Footwear;

public class Sneakers extends Footwear {
    public Sneakers() {
        super();
        System.out.println("no-arg const of sneakers");
    }

    @Override
    public void wear() {
        System.out.println("running wear in sneakers");
    }

    public void tieLaces() {
        System.out.println("running tieLaces in sneakers");
    }
}
