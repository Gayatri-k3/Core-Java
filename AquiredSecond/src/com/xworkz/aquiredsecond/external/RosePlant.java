package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Plant;

public class RosePlant extends Plant {
    public RosePlant() {
        super();
        System.out.println("no-arg const of rose plant");
    }

    @Override
    public void grow() {
        System.out.println("running grow in rose plant");
    }

    public void bloom() {
        System.out.println("running bloom in rose plant");
    }
}
