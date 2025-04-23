package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Calculator;

public class CasioCalculator implements Calculator {
    public void add() { System.out.println("Adding"); }
    public void subtract() { System.out.println("Subtracting"); }
    public void multiply() { System.out.println("Multiplying"); }
    public void divide() { System.out.println("Dividing"); }
    public void modulo() { System.out.println("Modulo operation"); }
    public void square() { System.out.println("Calculating square"); }
    public void squareRoot() { System.out.println("Calculating square root"); }
}