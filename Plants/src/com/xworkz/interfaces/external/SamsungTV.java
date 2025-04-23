package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.SmartTV;

public class SamsungTV implements SmartTV {
    public void turnOn() { System.out.println("TV On"); }
    public void turnOff() { System.out.println("TV Off"); }
    public void connectWifi() { System.out.println("Connecting WiFi"); }
    public void streamVideo() { System.out.println("Streaming video"); }
    public void openApp() { System.out.println("Opening app"); }
    public void closeApp() { System.out.println("Closing app"); }
    public void changeVolume() { System.out.println("Changing volume"); }
    public void changeBrightness() { System.out.println("Changing brightness"); }
    public void updateSoftware() { System.out.println("Updating software"); }
}