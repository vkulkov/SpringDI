package com.springinaction.springidol.other;

public class Song {
    private String title;
    private String composer;
    private String lyrics;

    public Song(String title, String composer, String lyrics) {
        this.title = title;
        this.composer = composer;
        this.lyrics = lyrics;
    }

    public String getTitle() {
        return title;
    }

    public String getComposer() {
        return composer;
    }

    public String getLyrics() {
        return lyrics;
    }
}
