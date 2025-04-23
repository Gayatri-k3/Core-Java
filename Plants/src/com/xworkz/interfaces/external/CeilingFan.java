package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Fan;

public class CeilingFan implements Fan {
    public void rotate() {
        System.out.println("CeilingFan is rotating");
    }
}