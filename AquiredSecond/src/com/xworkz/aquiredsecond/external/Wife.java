package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Spouse;

public class Wife extends Spouse {
    public Wife() {
        super();
        System.out.println("no-arg const of wife");
    }

    @Override
    public void love() {
        System.out.println("running love in wife");
    }

    public void cookMeal() {
        System.out.println("running cookMeal in wife");
    }
}
