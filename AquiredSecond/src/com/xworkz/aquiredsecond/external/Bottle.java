package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Container;

public class Bottle extends Container {
    public Bottle() {
        super();
        System.out.println("no-arg const of bottle");
    }

    @Override
    public void fill() {
        System.out.println("running fill in bottle");
    }

    public void pour() {
        System.out.println("running pour in bottle");
    }
}
