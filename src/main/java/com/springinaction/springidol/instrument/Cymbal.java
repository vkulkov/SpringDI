package com.springinaction.springidol.instrument;

import com.springinaction.springidol.Instrument;

public class Cymbal implements Instrument {
    @Override
    public void play() {
        System.out.println("CRASH CRASH CRASH");
    }
}
