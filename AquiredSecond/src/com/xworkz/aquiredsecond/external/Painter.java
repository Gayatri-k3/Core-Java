package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Artist;

public class Painter extends Artist {
    public Painter() {
        super();
        System.out.println("no-arg const of painter");
    }

    @Override
    public void create() {
        System.out.println("running create in painter");
    }

    public void mixColors() {
        System.out.println("running mixColors in painter");
    }
}
