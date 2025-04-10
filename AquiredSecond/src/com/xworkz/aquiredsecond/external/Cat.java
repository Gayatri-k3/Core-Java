package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Pet;

public class Cat extends Pet {
    public Cat() {
        super();
        System.out.println("no-arg const of cat");
    }

    @Override
    public void feed() {
        System.out.println("running feed in cat");
    }

    public void purr() {
        System.out.println("running purr in cat");
    }
}
