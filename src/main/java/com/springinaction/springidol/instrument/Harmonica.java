package com.springinaction.springidol.instrument;

import com.springinaction.springidol.Instrument;

public class Harmonica implements Instrument {
    @Override
    public void play() {
        System.out.println("HUM HUM HUM");
    }
}
