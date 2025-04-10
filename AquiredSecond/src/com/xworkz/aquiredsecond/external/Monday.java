package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Day;

public class Monday extends Day {
    public Monday() {
        super();
        System.out.println("no-arg const of monday");
    }

    @Override
    public void start() {
        System.out.println("running start in monday");
    }

    public void feelLazy() {
        System.out.println("running feelLazy in monday");
    }
}
