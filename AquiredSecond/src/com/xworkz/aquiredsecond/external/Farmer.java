package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Worker;

public class Farmer extends Worker {
    public Farmer(){
        System.out.println("no-arg const of farmer");
    }
    @Override
    public void work(){
        System.out.println("running work in farmer");
    }
    public void yield(){
        System.out.println("running yield in farmer");
    }
}
