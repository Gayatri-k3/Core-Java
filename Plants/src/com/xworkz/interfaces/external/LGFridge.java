package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Refrigerator;

public class LGFridge implements Refrigerator {
    public void cool() { System.out.println("Cooling items"); }
    public void freeze() { System.out.println("Freezing items"); }
    public void defrost() { System.out.println("Defrosting"); }
    public void setTemperature() { System.out.println("Setting temperature"); }
    public void openDoor() { System.out.println("Opening door"); }
    public void closeDoor() { System.out.println("Closing door"); }
    public void lightOn() { System.out.println("Turning on light"); }
}