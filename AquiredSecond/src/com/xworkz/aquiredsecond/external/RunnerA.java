package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Athlete;

public class RunnerA extends Athlete {
    public RunnerA() {
        super();
        System.out.println("no-arg const of runner");
    }

    @Override
    public void train() {
        System.out.println("running train in runner");
    }

    public void sprint() {
        System.out.println("running sprint in runner");
    }
}
