package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Parent;

public class Mother extends Parent {
    public Mother() {
        super();
        System.out.println("no-arg const of mother");
    }

    @Override
    public void care() {
        System.out.println("running care in mother");
    }

    public void cookMeal() {
        System.out.println("running cookMeal in mother");
    }
}
