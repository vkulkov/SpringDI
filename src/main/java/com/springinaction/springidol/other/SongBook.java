package com.springinaction.springidol.other;

public class SongBook {
    private String[] songTitles;

    public SongBook(String[] songTitles) {
        this.songTitles = songTitles;
    }

    public String pickASong() {
        return songTitles[0];
    }
}
