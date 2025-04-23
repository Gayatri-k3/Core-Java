package com.xworkz.interfaces.internal;

public interface Drone {
    void takeOff();
    void land();
    void hover();
    void moveForward();
    void moveBackward();
    void moveLeft();
    void moveRight();
    void rotate();
    void captureImage();
}