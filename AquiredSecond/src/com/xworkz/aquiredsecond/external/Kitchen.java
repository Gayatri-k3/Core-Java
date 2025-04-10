package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Room;

public class Kitchen extends Room {
    public Kitchen() {
        super();
        System.out.println("no-arg const of kitchen");
    }

    @Override
    public void enter() {
        System.out.println("running enter in kitchen");
    }

    public void cookFood() {
        System.out.println("running cookFood in kitchen");
    }
}
