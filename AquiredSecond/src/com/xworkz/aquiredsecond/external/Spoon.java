package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Utensil;

public class Spoon extends Utensil {
    public Spoon() {
        super();
        System.out.println("no-arg const of spoon");
    }

    @Override
    public void holdFood() {
        System.out.println("running holdFood in spoon");
    }

    public void scoop() {
        System.out.println("running scoop in spoon");
    }
}
