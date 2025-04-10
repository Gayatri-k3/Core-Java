package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Guardian;

public class Grandparent extends Guardian {
    public Grandparent() {
        super();
        System.out.println("no-arg const of grandparent");
    }

    @Override
    public void protect() {
        System.out.println("running protect in grandparent");
    }

    public void tellStories() {
        System.out.println("running tellStories in grandparent");
    }
}
