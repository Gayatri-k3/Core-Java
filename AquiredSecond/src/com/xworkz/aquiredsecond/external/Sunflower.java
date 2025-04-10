package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Flower;

public class Sunflower extends Flower {
    public Sunflower() {
        super();
        System.out.println("no-arg const of sunflower");
    }

    @Override
    public void bloom() {
        System.out.println("running bloom in sunflower");
    }

    public void faceSun() {
        System.out.println("running faceSun in sunflower");
    }
}
