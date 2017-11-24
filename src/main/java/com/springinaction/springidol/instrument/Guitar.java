package com.springinaction.springidol.instrument;

import com.springinaction.springidol.Instrument;

public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("STRUM STRUM STRUM");
    }
}
