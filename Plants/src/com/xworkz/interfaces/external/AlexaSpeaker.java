package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.SmartSpeaker;

public class AlexaSpeaker implements SmartSpeaker {
    public void playMusic() { System.out.println("Playing music"); }
    public void pauseMusic() { System.out.println("Pausing music"); }
    public void stopMusic() { System.out.println("Stopping music"); }
    public void increaseVolume() { System.out.println("Increasing volume"); }
    public void decreaseVolume() { System.out.println("Decreasing volume"); }
    public void readNews() { System.out.println("Reading news"); }
    public void answerQuestion() { System.out.println("Answering question"); }
}
