package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Rock;

public class Granite extends Rock {
    public Granite() {
        super();
        System.out.println("no-arg const of granite");
    }

    @Override
    public void erodeSlowly() {
        System.out.println("running erodeSlowly in granite");
    }

    public void polish() {
        System.out.println("running polish in granite");
    }
}
