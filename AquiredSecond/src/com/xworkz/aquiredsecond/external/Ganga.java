package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.River;

public class Ganga extends River {
    public Ganga() {
        super();
        System.out.println("no-arg const of ganga");
    }

    @Override
    public void flow() {
        System.out.println("running flow in ganga");
    }

    public void purify() {
        System.out.println("running purify in ganga");
    }
}
