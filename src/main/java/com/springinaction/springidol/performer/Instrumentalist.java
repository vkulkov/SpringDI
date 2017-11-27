package com.springinaction.springidol.performer;

import com.springinaction.springidol.Instrument;
import com.springinaction.springidol.Performer;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable("pianist")
public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        System.out.print("Playing " + song + ": ");
        instrument.play();
    }
}
