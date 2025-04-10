package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Caregiver;

public class Babysitter extends Caregiver {
    public Babysitter() {
        super();
        System.out.println("no-arg const of babysitter");
    }

    @Override
    public void takeCare() {
        System.out.println("running takeCare in babysitter");
    }

    public void changeDiaper() {
        System.out.println("running changeDiaper in babysitter");
    }
}
