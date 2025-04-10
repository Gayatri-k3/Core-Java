package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Ceremony;

public class GraduationCeremony extends Ceremony {
    public GraduationCeremony() {
        super();
        System.out.println("no-arg const of graduationCeremony");
    }

    @Override
    public void commence() {
        System.out.println("running commence in graduationCeremony");
    }

    public void giveDegrees() {
        System.out.println("running giveDegrees in graduationCeremony");
    }
}
