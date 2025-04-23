package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.MusicPlayer;

public class SpotifyPlayer implements MusicPlayer {
    public void play() {
        System.out.println("Playing music");
    }
    public void pause() {
        System.out.println("Music paused");
    }
    public void stop() {
        System.out.println("Music stopped");
    }
    public void next() {
        System.out.println("Next track");
    }
    public void previous() {
        System.out.println("Previous track");
    }
}