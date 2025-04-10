package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Celebration;

public class BirthdayParty extends Celebration {
    public BirthdayParty() {
        super();
        System.out.println("no-arg const of birthdayParty");
    }

    @Override
    public void enjoy() {
        System.out.println("running enjoy in birthdayParty");
    }

    public void cutCake() {
        System.out.println("running cutCake in birthdayParty");
    }
}
