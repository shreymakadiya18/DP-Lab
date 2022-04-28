/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author om patel
 */
public class AdapterTest {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Animals.mp3");
        audioPlayer.play("mp4", "Jurassic World.mp4");
        audioPlayer.play("vlc", "Titanic.vlc");
        audioPlayer.play("mov", "Avengers.mov");
    }
}
