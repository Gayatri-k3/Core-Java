package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Laptop;

public class DellLaptop implements Laptop {
    public void boot() {
        System.out.println("Laptop booting up");
    }
    public void shutDown() {
        System.out.println("Laptop shutting down");
    }
    public void sleep() {
        System.out.println("Laptop in sleep mode");
    }
    public void restart() {
        System.out.println("Laptop restarting");
    }
    public void hibernate() {
        System.out.println("Laptop hibernating");
    }
}