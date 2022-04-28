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
public class MP4Player implements AdvancedMediaPlayer{
    @Override
    public void playVLC(String fileName) {
        
    }
    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing mp4 file: "+ fileName);
    }
}
