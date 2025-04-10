package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Dessert;

public class IceCream extends Dessert {
    public IceCream() {
        super();
        System.out.println("no-arg const of ice cream");
    }

    @Override
    public void serve() {
        System.out.println("running serve in ice cream");
    }

    public void freeze() {
        System.out.println("running freeze in ice cream");
    }
}
