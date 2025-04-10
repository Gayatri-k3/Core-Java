package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Reptile;

public class Lizard extends Reptile {
    public Lizard() {
        super();
        System.out.println("no-arg const of lizard");
    }

    @Override
    public void shedSkin() {
        System.out.println("running shedSkin in lizard");
    }

    public void climbWall() {
        System.out.println("running climbWall in lizard");
    }
}
