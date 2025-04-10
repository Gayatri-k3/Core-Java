package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Instrument;

public class Guitar extends Instrument {
    public Guitar() {
        super();
        System.out.println("no-arg const of guitar");
    }

    @Override
    public void play() {
        System.out.println("running play in guitar");
    }

    public void strum() {
        System.out.println("running strum in guitar");
    }
}
