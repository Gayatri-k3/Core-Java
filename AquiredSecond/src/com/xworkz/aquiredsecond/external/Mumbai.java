package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.City;

public class Mumbai extends City {
    public Mumbai() {
        super();
        System.out.println("no-arg const of mumbai");
    }

    @Override
    public void grow() {
        System.out.println("running grow in mumbai");
    }

    public void hostBollywood() {
        System.out.println("running hostBollywood in mumbai");
    }
}
