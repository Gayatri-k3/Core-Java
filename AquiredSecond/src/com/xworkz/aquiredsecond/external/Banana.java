package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Fruit;

public class Banana extends Fruit {
    public Banana() {
        super();
        System.out.println("no-arg const of banana");
    }

    @Override
    public void ripen() {
        System.out.println("running ripen in banana");
    }

    public void peel() {
        System.out.println("running peel in banana");
    }
}
