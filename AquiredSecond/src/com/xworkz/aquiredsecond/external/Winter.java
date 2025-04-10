package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Season;

public class Winter extends Season {
    public Winter() {
        super();
        System.out.println("no-arg const of winter");
    }

    @Override
    public void start() {
        System.out.println("running start in winter");
    }

    public void snow() {
        System.out.println("running snow in winter");
    }
}
