package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Painting;

public class Portrait extends Painting {
    public Portrait() {
        super();
        System.out.println("no-arg const of portrait");
    }

    @Override
    public void display() {
        System.out.println("running display in portrait");
    }

    public void frame() {
        System.out.println("running frame in portrait");
    }
}
