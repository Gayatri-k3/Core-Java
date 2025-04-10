package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Emotion;

public class Happiness extends Emotion {
    public Happiness() {
        super();
        System.out.println("no-arg const of happiness");
    }

    @Override
    public void feel() {
        System.out.println("running feel in happiness");
    }

    public void smile() {
        System.out.println("running smile in happiness");
    }
}
