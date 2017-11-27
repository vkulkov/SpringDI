package com.springinaction.springidol.performer;

import com.springinaction.springidol.Instrument;
import com.springinaction.springidol.Performer;

public abstract class InstrumentalistWithoutInstrument implements Performer {
    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public abstract Instrument getInstrument();

    @Override
    public void perform() {
        System.out.print("Playing " + song + ": ");
        getInstrument().play();
    }
}
