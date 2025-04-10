package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Bag;

public class Backpack extends Bag {
    public Backpack() {
        super();
        System.out.println("no-arg const of backpack");
    }

    @Override
    public void carry() {
        System.out.println("running carry in backpack");
    }

    public void zipUp() {
        System.out.println("running zipUp in backpack");
    }
}
