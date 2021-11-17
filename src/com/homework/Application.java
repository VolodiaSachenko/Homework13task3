package com.homework;

/**
 * @author Volodia Sachenko
 * @version 0.1
 * @since 16.11.21
 */

public class Application {
    public static void main(String[] args) {
        Player player = new Player();
        player.play();
        player.pause();
        player.stop();
        player.record();
    }
}
