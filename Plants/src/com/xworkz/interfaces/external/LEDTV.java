package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.TV;

public class LEDTV implements TV {
    public void switchOn() {
        System.out.println("TV switched on");
    }
    public void changeChannel() {
        System.out.println("Channel changed");
    }
    public void adjustVolume() {
        System.out.println("Volume adjusted");
    }
}