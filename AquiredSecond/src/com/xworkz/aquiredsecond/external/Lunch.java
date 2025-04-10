package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Meal;

public class Lunch extends Meal {
    public Lunch() {
        super();
        System.out.println("no-arg const of lunch");
    }

    @Override
    public void serve() {
        System.out.println("running serve in lunch");
    }

    public void energize() {
        System.out.println("running energize in lunch");
    }
}
