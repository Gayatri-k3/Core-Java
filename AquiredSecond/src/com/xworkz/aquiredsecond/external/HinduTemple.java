package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Temple;

public class HinduTemple extends Temple {
    public HinduTemple() {
        super();
        System.out.println("no-arg const of hinduTemple");
    }

    @Override
    public void worship() {
        System.out.println("running worship in hinduTemple");
    }

    public void ringBell() {
        System.out.println("running ringBell in hinduTemple");
    }
}
