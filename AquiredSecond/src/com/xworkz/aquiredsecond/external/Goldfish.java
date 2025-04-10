package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Fish;

public class Goldfish extends Fish {
    public Goldfish() {
        super();
        System.out.println("no-arg const of goldfish");
    }

    @Override
    public void swim() {
        System.out.println("running swim in goldfish");
    }

    public void blowBubbles() {
        System.out.println("running blowBubbles in goldfish");
    }
}
