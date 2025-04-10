package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Tool;

public class Hammer extends Tool {
    public Hammer() {
        super();
        System.out.println("no-arg const of hammer");
    }

    @Override
    public void use() {
        System.out.println("running use in hammer");
    }

    public void hitNail() {
        System.out.println("running hitNail in hammer");
    }
}
