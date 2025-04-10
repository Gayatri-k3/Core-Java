package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Neighbor;

public class NextDoorNeighbor extends Neighbor {
    public NextDoorNeighbor() {
        super();
        System.out.println("no-arg const of nextDoorNeighbor");
    }

    @Override
    public void greet() {
        System.out.println("running greet in nextDoorNeighbor");
    }

    public void borrowSugar() {
        System.out.println("running borrowSugar in nextDoorNeighbor");
    }
}
