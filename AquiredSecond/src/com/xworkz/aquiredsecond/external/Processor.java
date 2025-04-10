package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.ComputerComponent;

public class Processor extends ComputerComponent {
    public Processor() {
        super();
        System.out.println("no-arg const of processor");
    }

    @Override
    public void work() {
        System.out.println("running work in processor");
    }

    public void compute() {
        System.out.println("running compute in processor");
    }
}
