package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Child1;

public class Daughter extends Child1 {
    public Daughter() {
        super();
        System.out.println("no-arg const of daughter");
    }

    @Override
    public void play() {
        System.out.println("running play in daughter");
    }

    public void helpMother() {
        System.out.println("running helpMother in daughter");
    }
}
