package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Building;

public class House extends Building {
    public House() {
        super();
        System.out.println("no-arg const of house");
    }

    @Override
    public void openDoor() {
        System.out.println("running openDoor in house");
    }

    public void switchOnLights() {
        System.out.println("running switchOnLights in house");
    }
}
