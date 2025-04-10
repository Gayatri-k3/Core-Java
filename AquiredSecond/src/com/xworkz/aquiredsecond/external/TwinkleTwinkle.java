package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Rhyme;

public class TwinkleTwinkle extends Rhyme {
    public TwinkleTwinkle() {
        super();
        System.out.println("no-arg const of twinkleTwinkle");
    }

    @Override
    public void recite() {
        System.out.println("running recite in twinkleTwinkle");
    }

    public void teachStars() {
        System.out.println("running teachStars in twinkleTwinkle");
    }
}
