package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.SmartWatch;

public class AppleWatch implements SmartWatch {
    public void trackSteps() {
        System.out.println("Tracking steps");
    }
    public void showTime() {
        System.out.println("Showing time");
    }
    public void monitorHeartRate() {
        System.out.println("Monitoring heart rate");
    }
    public void receiveNotifications() {
        System.out.println("Receiving notifications");
    }
    public void setAlarm() {
        System.out.println("Alarm set");
    }
}