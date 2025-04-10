package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Sweet;

public class Ladoo extends Sweet {
    public Ladoo() {
        super();
        System.out.println("no-arg const of ladoo");
    }

    @Override
    public void make() {
        System.out.println("running make in ladoo");
    }

    public void offerInTemple() {
        System.out.println("running offerInTemple in ladoo");
    }
}
