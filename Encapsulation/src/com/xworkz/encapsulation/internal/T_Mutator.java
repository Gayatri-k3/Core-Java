package com.xworkz.encapsulation.internal;

public class T_Mutator {
    Tank tank;

    public T_Mutator(Tank tank) {
        this.tank = tank;
        System.out.println("Tank Mutator Constructor");
    }

    public void mutator() {
        Tank tank = new Tank();
        tank.setType("Heavy Tank");
        tank.setModel("Abrams M1");
        tank.setWeight(62.0);
        tank.setCrew(4);
        tank.setActive(false);

        System.out.println("Type: " + tank.getType());
        System.out.println("Model: " + tank.getModel());
        System.out.println("Weight: " + tank.getWeight());
        System.out.println("Crew: " + tank.getCrew());
        System.out.println("Active?: " + tank.getActive());
    }
}
