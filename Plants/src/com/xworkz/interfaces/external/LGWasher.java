package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.WashingMachine;

public class LGWasher implements WashingMachine {
    public void wash() {
        System.out.println("Washing clothes");
    }
    public void rinse() {
        System.out.println("Rinsing clothes");
    }
    public void spin() {
        System.out.println("Spinning clothes");
    }
    public void dry() {
        System.out.println("Drying clothes");
    }
    public void stop() {
        System.out.println("Washing stopped");
    }
}
