package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.FitnessTracker;

public class FitBit implements FitnessTracker {
    public void startWorkout() { System.out.println("Workout started"); }
    public void stopWorkout() { System.out.println("Workout stopped"); }
    public void trackCalories() { System.out.println("Tracking calories"); }
    public void monitorHeart() { System.out.println("Monitoring heart"); }
    public void countSteps() { System.out.println("Counting steps"); }
    public void logSleep() { System.out.println("Logging sleep"); }
    public void syncData() { System.out.println("Syncing data"); }
    public void showStats() { System.out.println("Showing stats"); }
    public void shareProgress() { System.out.println("Sharing progress"); }
}