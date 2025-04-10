package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Furniture;

public class Chair extends Furniture {
    public Chair() {
        super();
        System.out.println("no-arg const of chair");
    }

    @Override
    public void support() {
        System.out.println("running support in chair");
    }

    public void fold() {
        System.out.println("running fold in chair");
    }
}
