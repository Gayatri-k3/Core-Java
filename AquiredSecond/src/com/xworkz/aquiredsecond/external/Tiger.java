package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.WildAnimal;

public class Tiger extends WildAnimal {
    public Tiger() {
        super();
        System.out.println("no-arg const of tiger");
    }

    @Override
    public void roamFreely() {
        System.out.println("running roamFreely in tiger");
    }

    public void roar() {
        System.out.println("running roar in tiger");
    }
}
