package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Area;

public class Village extends Area {
    public Village() {
        super();
        System.out.println("no-arg const of village");
    }

    @Override
    public void locate() {
        System.out.println("running locate in village");
    }

    public void growCrops() {
        System.out.println("running growCrops in village");
    }
}
