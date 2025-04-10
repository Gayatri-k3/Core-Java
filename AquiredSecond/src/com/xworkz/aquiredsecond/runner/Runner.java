package com.xworkz.aquiredsecond.runner;

import com.xworkz.aquiredsecond.external.*;
import com.xworkz.aquiredsecond.internal.*;

public class Runner {
    public static void main(String[] args) {
        Person personP = new Person();
        Person personC = new Child();
        personC.sleep();
        System.out.println();
        Child child = new Child();
        child.sleep();
        child.talk();

        System.out.println();
        Worker worker = new Worker();
        Worker workerC = new Farmer();
        workerC.work();
        System.out.println();
        Farmer farmer = new Farmer();
        farmer.work();
        farmer.yield();
    }
}
