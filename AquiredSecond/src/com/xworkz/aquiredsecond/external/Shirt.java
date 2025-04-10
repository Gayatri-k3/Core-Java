package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Cloth;

public class Shirt extends Cloth {
    public Shirt() {
        super();
        System.out.println("no-arg const of shirt");
    }

    @Override
    public void wear() {
        System.out.println("running wear in shirt");
    }

    public void buttonUp() {
        System.out.println("running buttonUp in shirt");
    }
}
