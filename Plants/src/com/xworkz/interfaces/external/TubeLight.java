package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Light;

public class TubeLight implements Light {
    public void glow() {
        System.out.println("TubeLight is glowing");
    }
}