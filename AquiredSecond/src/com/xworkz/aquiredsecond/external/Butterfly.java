package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Insect;

public class Butterfly extends Insect {
    public Butterfly() {
        super();
        System.out.println("no-arg const of butterfly");
    }

    @Override
    public void crawl() {
        System.out.println("running crawl in butterfly");
    }

    public void fly() {
        System.out.println("running fly in butterfly");
    }
}
