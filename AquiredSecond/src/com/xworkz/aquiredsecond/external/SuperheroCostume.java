package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Costume;

public class SuperheroCostume extends Costume {
    public SuperheroCostume() {
        super();
        System.out.println("no-arg const of superheroCostume");
    }

    @Override
    public void wear() {
        System.out.println("running wear in superheroCostume");
    }

    public void saveWorld() {
        System.out.println("running saveWorld in superheroCostume");
    }
}
