package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Elevator;

public class OtisElevator implements Elevator {
    public void moveUp() { System.out.println("Moving up"); }
    public void moveDown() { System.out.println("Moving down"); }
    public void stop() { System.out.println("Stopping elevator"); }
    public void openDoor() { System.out.println("Opening elevator door"); }
    public void closeDoor() { System.out.println("Closing elevator door"); }
    public void emergencyStop() { System.out.println("Emergency stop"); }
    public void ringAlarm() { System.out.println("Ringing alarm"); }
}