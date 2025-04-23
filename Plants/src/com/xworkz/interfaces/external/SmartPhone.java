package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Mobile;

public class SmartPhone implements Mobile {
    public void call() {
        System.out.println("Calling a contact");
    }
    public void message() {
        System.out.println("Sending a message");
    }
    public void browse() {
        System.out.println("Browsing the internet");
    }
}