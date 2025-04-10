package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Game;

public class Cricket extends Game {
    public Cricket() {
        super();
        System.out.println("no-arg const of cricket");
    }

    @Override
    public void play() {
        System.out.println("running play in cricket");
    }

    public void scoreRun() {
        System.out.println("running scoreRun in cricket");
    }
}
