package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Relative;

public class Cousin extends Relative {
    public Cousin() {
        super();
        System.out.println("no-arg const of cousin");
    }

    @Override
    public void visit() {
        System.out.println("running visit in cousin");
    }

    public void playGames() {
        System.out.println("running playGames in cousin");
    }
}
