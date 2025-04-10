package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Sport;

public class Football extends Sport {
    public Football() {
        super();
        System.out.println("no-arg const of football");
    }

    @Override
    public void play() {
        System.out.println("running play in football");
    }

    public void kickBall() {
        System.out.println("running kickBall in football");
    }
}
