package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Pen;

public class BallPen implements Pen {
    public void write() {
        System.out.println("BallPen is writing");
    }
}