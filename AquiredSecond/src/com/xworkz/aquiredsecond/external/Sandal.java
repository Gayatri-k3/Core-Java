package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Accessory;
import com.xworkz.aquiredsecond.internal.Footwear;

public class Sandal extends Accessory {
    public Sandal() {
        super();
        System.out.println("no-arg const of sandal");
    }

    @Override
    public void protectFeet() {
        System.out.println("running protectFeet in sandal");
    }

    public void gripSurface() {
        System.out.println("running gripSurface in sandal");
    }
}
