package com.homework;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println((char) 27 + "[32m" + "The Doors — Break On Through (To The Other Side) 2:28");
        System.out.println("▶");
        System.out.println("01:23 - 2:28");
    }

    @Override
    public void pause() {
        System.out.println("\nPause this track");
        System.out.println("⏸");
        System.out.println("EQ: Rock");
    }

    @Override
    public void stop() {
        System.out.println("\nAudio format: WAV");
        System.out.println("⏹");
        System.out.println("Genre: Psychedelic rock");
    }

    @Override
    public void record() {
        System.out.println("\nRecord quality: Best");
        System.out.println("⏺");
        System.out.println("00:00.wav");
    }
}
