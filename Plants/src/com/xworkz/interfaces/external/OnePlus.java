package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.SPhone;

public class OnePlus implements SPhone {
    public void unlock() { System.out.println("Unlocking phone"); }
    public void openCamera() { System.out.println("Opening camera"); }
    public void makeCall() { System.out.println("Making call"); }
    public void sendMessage() { System.out.println("Sending message"); }
    public void browseInternet() { System.out.println("Browsing internet"); }
    public void playGame() { System.out.println("Playing game"); }
    public void useGPS() { System.out.println("Using GPS"); }
    public void installApp() { System.out.println("Installing app"); }
    public void uninstallApp() { System.out.println("Uninstalling app"); }
}
