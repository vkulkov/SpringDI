package com.springinaction.springidol.instrument;

import com.springinaction.springidol.Instrument;

public class Saxophone implements Instrument {
    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}
