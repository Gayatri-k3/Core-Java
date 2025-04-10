package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Mammal;

public class Elephant extends Mammal {
    public Elephant() {
        super();
        System.out.println("no-arg const of elephant");
    }

    @Override
    public void nurseYoung() {
        System.out.println("running nurseYoung in elephant");
    }

    public void sprayWater() {
        System.out.println("running sprayWater in elephant");
    }
}
