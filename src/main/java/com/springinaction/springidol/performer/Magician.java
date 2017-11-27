package com.springinaction.springidol.performer;

import com.springinaction.springidol.MagicBox;
import com.springinaction.springidol.Performer;

public class Magician implements Performer {
    private String magicWords;
    private MagicBox magicBox;

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    @Override
    public void perform() {
        System.out.println(magicWords);
        System.out.println("Magic box contains...");
        System.out.println(magicBox.getContents());
    }
}
