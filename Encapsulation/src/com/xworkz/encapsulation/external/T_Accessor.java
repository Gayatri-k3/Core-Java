package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Tank;

public class T_Accessor {
    Tank tank;

    public T_Accessor(Tank tank) {
        this.tank = tank;
        System.out.println("Tank Accessor Constructor");
    }

    public void show() {
        System.out.println("Type: " + tank.getType());
        System.out.println("Model: " + tank.getModel());
        System.out.println("Weight: " + tank.getWeight());
        System.out.println("Crew: " + tank.getCrew());
        System.out.println("Active?: " + tank.getActive());
    }
}
