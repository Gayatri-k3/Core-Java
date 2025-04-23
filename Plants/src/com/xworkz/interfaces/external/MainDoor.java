package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Door;

public class MainDoor implements Door {
    public void open() {
        System.out.println("Main door is opening");
    }
}