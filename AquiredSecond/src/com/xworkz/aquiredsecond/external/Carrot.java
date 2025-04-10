package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Vegetable;

public class Carrot extends Vegetable {
    public Carrot() {
        super();
        System.out.println("no-arg const of carrot");
    }

    @Override
    public void grow() {
        System.out.println("running grow in carrot");
    }

    public void improveVision() {
        System.out.println("running improveVision in carrot");
    }
}
