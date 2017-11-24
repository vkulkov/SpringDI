package com.springinaction.springidol.instrument;

import com.springinaction.springidol.Instrument;

public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
