package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Song;

public class NurserySong extends Song {
    public NurserySong() {
        super();
        System.out.println("no-arg const of nurserySong");
    }

    @Override
    public void sing() {
        System.out.println("running sing in nurserySong");
    }

    public void teachAlphabet() {
        System.out.println("running teachAlphabet in nurserySong");
    }
}
