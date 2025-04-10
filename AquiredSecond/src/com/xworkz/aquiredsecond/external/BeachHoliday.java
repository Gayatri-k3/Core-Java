package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Vacation;

public class BeachHoliday extends Vacation {
    public BeachHoliday() {
        super();
        System.out.println("no-arg const of beachHoliday");
    }

    @Override
    public void enjoyTime() {
        System.out.println("running enjoyTime in beachHoliday");
    }

    public void swim() {
        System.out.println("running swim in beachHoliday");
    }
}
