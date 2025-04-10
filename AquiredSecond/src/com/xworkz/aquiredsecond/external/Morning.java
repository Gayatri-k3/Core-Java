package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.TimePeriod;

public class Morning extends TimePeriod {
    public Morning() {
        super();
        System.out.println("no-arg const of morning");
    }

    @Override
    public void begin() {
        System.out.println("running begin in morning");
    }

    public void shineSun() {
        System.out.println("running shineSun in morning");
    }
}
