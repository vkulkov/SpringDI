package com.springinaction.springidol.performer;

import com.springinaction.springidol.Instrument;
import com.springinaction.springidol.Performer;

import java.util.Collection;

public class OneManBand implements Performer {
    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() {
        for (Instrument instrument :
                instruments) {
            instrument.play();
        }
    }
}
