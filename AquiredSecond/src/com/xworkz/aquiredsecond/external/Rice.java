package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Grain;

public class Rice extends Grain {
    public Rice() {
        super();
        System.out.println("no-arg const of rice");
    }

    @Override
    public void harvest() {
        System.out.println("running harvest in rice");
    }

    public void cook() {
        System.out.println("running cook in rice");
    }
}
