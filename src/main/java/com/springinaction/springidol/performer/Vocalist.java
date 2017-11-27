package com.springinaction.springidol.performer;

import com.springinaction.springidol.Performer;

public class Vocalist implements Performer {
    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void perform() {
        System.out.print("Playing " + song + ": ");
    }
}
