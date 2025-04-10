package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Drink;

public class Juice extends Drink {
    public Juice() {
        super();
        System.out.println("no-arg const of juice");
    }

    @Override
    public void serve() {
        System.out.println("running serve in juice");
    }

    public void mixFlavors() {
        System.out.println("running mixFlavors in juice");
    }
}
