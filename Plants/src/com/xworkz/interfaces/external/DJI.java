package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Drone;

public class DJI implements Drone {
    public void takeOff() { System.out.println("Taking off"); }
    public void land() { System.out.println("Landing"); }
    public void hover() { System.out.println("Hovering"); }
    public void moveForward() { System.out.println("Moving forward"); }
    public void moveBackward() { System.out.println("Moving backward"); }
    public void moveLeft() { System.out.println("Moving left"); }
    public void moveRight() { System.out.println("Moving right"); }
    public void rotate() { System.out.println("Rotating"); }
    public void captureImage() { System.out.println("Capturing image"); }
}