package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Partner;

public class Husband extends Partner {
    public Husband() {
        super();
        System.out.println("no-arg const of husband");
    }

    @Override
    public void support() {
        System.out.println("running support in husband");
    }

    public void provide() {
        System.out.println("running provide in husband");
    }
}
