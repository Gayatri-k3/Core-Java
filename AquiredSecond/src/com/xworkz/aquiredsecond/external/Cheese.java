package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.DairyProduct;

public class Cheese extends DairyProduct {
    public Cheese() {
        super();
        System.out.println("no-arg const of cheese");
    }

    @Override
    public void store() {
        System.out.println("running store in cheese");
    }

    public void melt() {
        System.out.println("running melt in cheese");
    }
}
