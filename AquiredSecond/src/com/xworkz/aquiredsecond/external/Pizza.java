package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Food;

public class Pizza extends Food {
    public Pizza() {
        super();
        System.out.println("no-arg const of pizza");
    }

    @Override
    public void prepare() {
        System.out.println("running prepare in pizza");
    }

    public void bake() {
        System.out.println("running bake in pizza");
    }
}
