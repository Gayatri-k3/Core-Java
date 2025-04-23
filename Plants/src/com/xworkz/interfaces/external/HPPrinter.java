package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Printer;

public class HPPrinter implements Printer {
    public void print() {
        System.out.println("Printing document");
    }
    public void scan() {
        System.out.println("Scanning document");
    }
    public void copy() {
        System.out.println("Copying document");
    }
}
