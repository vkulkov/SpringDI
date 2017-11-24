package com.springinaction.springidol.performer;

import com.springinaction.springidol.Instrument;
import com.springinaction.springidol.Performer;

import java.util.Map;

public class OneManBandWithMap implements Performer {
    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() {
        for (String key :
                instruments.keySet()) {
            System.out.print(key + ": ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
}
