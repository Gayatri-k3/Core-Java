package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Camera;

public class DSLR implements Camera {
    public void capture() {
        System.out.println("Capturing photo");
    }
    public void record() {
        System.out.println("Recording video");
    }
    public void zoom() {
        System.out.println("Zooming in");
    }
}